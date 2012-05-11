package com.ashu.javasamples.tree;

import java.util.ArrayList;

public class BST {

	private Node root;

	public BST() {
		root = null;
	}

	public Node getRootNode() {
		return root;
	}

	public Node create(int _element) {
		return new Node(_element);
	}

	public void insert(Node _node) {
		if (root == null) {
			root = create(_node.element);
		} else {
			Node father = null;
			Node child = root;
			while (child != null) {
				father = child;
				if (child.element > _node.element) {
					child = child.lptr;
				} else {
					child = child.rptr;
				}
			}

			if (father.element > _node.element) {
				father.lptr = create(_node.element);
			} else {
				father.rptr = create(_node.element);
			}
		}
	}

	public void delete(Node _node) {
		if (_node == null) {
			System.out.println("null node");
			return;
		}

		Node father = null;
		Node child = root;

		while (child.element != _node.element) {
			father = child;
			if (child.element > _node.element) {
				child = child.lptr;
			} else {
				child = child.rptr;
			}
		}

		if (child.lptr == null && child.rptr == null) {
			if (father.lptr == child) {
				father.lptr = null;
			} else {
				father.rptr = null;
			}
			child = null;
		} else if ((child.lptr == null && child.rptr != null)
				|| (child.lptr != null && child.rptr == null)) {

			if (father.lptr == child) {
				if (child.lptr == null) {
					father.lptr = child.rptr;
				} else {
					father.lptr = child.lptr;
				}
			} else {
				if (child.lptr == null) {
					father.rptr = child.rptr;
				} else {
					father.rptr = child.lptr;
				}
			}
		} else if (child.lptr != null && child.rptr != null){
			Node parent = child;
			Node successor = child.rptr;
			
			while (successor.lptr != null) {
				parent = successor;
				successor = successor.lptr;
			}
			
			if (father.lptr == child) {
				father.lptr.element = successor.element;
				parent.lptr = null;
			}
			
			successor.lptr = null;
		}
	}

	public void traverseInorder(Node node) {
		if (node != null) {
			traverseInorder(node.lptr);
			System.out.println(node.element);
			traverseInorder(node.rptr);
		}
	}
	
	public ArrayList<ArrayList<Node>> getRootToLeafPaths(Node n, ArrayList<Node> path, ArrayList<ArrayList<Node>> list) {
		
		if (n == null) {
			return null;
		}
		
		path.add(n);
		
		if (n.lptr == null && n.rptr == null) {
			list.add(path);
			return list;
		}
		
		ArrayList<Node> lpath = new ArrayList<Node>(path);
		ArrayList<Node> rpath = new ArrayList<Node>(path);
		getRootToLeafPaths(n.lptr, lpath, list);
		getRootToLeafPaths(n.rptr, rpath, list);
		
		return list;
		
	}
}
