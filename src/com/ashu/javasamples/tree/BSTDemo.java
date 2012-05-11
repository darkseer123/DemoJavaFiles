package com.ashu.javasamples.tree;

import java.util.ArrayList;

public class BSTDemo {

	public static void main(String[] args) {
	
		int[] arr = {18, 8, 6, 70, 30, 40, 1, 7, 10, 17, 9 };
		BST tree = new BST();
		
		for (int i : arr) {
			Node n = tree.create(i);
			tree.insert(n);
		}
		
		/*int toDelete = 8;
		System.out.println("Deleting " + toDelete);
		tree.delete(tree.create(toDelete));
		
		System.out.println ("The tree (inorder) is: ");
		tree.traverseInorder(tree.getRootNode());*/
		
		ArrayList<ArrayList<Node>> list = tree.getRootToLeafPaths(tree.getRootNode(), new ArrayList<Node>(), new ArrayList<ArrayList<Node>>());
		
		for (ArrayList<Node> path : list) {
			for (Node n : path) {
				System.out.print(n.element + " -> ");
			}
			
			System.out.println();
		}
		
	}

}
