package com.ashu.javasamples.bst;

import java.io.IOException;

class BinarySearchTree {

	private static Node root;

	BinarySearchTree() {
		root = null;
	}

	private Node createNode() throws IOException {
		String str = TerminalUI.readInput();
		int value = Integer.parseInt(TerminalUI.readInput());
		Node newNode;

		if (str != null) {
			newNode = new Node(str, value);
		} else {
			newNode = new Node(value);
		}

		return newNode;
	}

	public void insertNode() {

		Node father = null;
		Node child = null;

		try {
			Node node = createNode();
			if (root == null) {
				root = node;
			} else {
				child = root;

				while (child != null) {
					if (node.getNodeValue() < child.getNodeValue()) {
						father = child;
						child = child.getLPTR();
						continue;
					}

					if (node.getNodeValue() > child.getNodeValue()) {
						father = child;
						child = child.getRPTR();
						continue;
					}
				}

				if (node.getNodeValue() < father.getNodeValue()) {
					father.setLPTR(node);
				} else {
					father.setRPTR(node);
				}
			}
		} catch (IOException e) {
			System.out.println("Unable to create new node");
			e.printStackTrace();
		}
	}

	public void deleteNode(Node _node) {

		Node father = null;
		Node child = root;

		while (child.getNodeValue() != _node.getNodeValue()) {
			if (child.equals(null)) {
				System.out.println("The node could not be located in BST");
				return;

			} else {
				if (_node.getNodeValue() < child.getNodeValue()) {
					father = child;
					child = child.getLPTR();
				} else {
					father = child;
					child = child.getRPTR();
				}
			}

			Node successor = findInorderSuccessor(father, child);

		}

	}

	private Node findInorderSuccessor(Node father, Node child) {

		Node successor = child;
		
		if (child.getLPTR() == null && child.getRPTR() == null) {
			successor = child;
			
		} else if ((child.getLPTR() == null && child.getRPTR() != null) 
				|| (child.getLPTR() != null && child.getRPTR() == null)) {
			
			if (child.getLPTR() == null) {
				successor = child.getRPTR();
			} else {
				successor = child.getLPTR();
			}
			
		} else if (child.getLPTR() != null && child.getRPTR() != null) {
			
		}
		
		return null;
	}

	public void showInorderTraversal() {

	}

	public void showPreorderTraversal() {

	}

	public void showPostorderTraversal() {

	}
}
