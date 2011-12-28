package com.ashu.javasamples.bst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TerminalUI {

	private TerminalUI() {

	}

	public static void showMainMenu() {
		String str = String.format("Enter your choice: \n");
		str += "1. Insert\n";
		str += "2. Delete\n";
		str += "3. View Inorder traversal of the Tree\n";
		str += "4. View Preorder traversal of the Tree\n";
		str += "5. View Postorder traversalof the Tree\n";
		str += "6. Exit\n";

		System.out.println(str);
	}

	public static void showInsertNodeMenu() {
		System.out.println("Enter the node to be inserted");
		System.out.println("arg1: Name of the Node (type: String)");
		System.out.println("arg2: The unique key of the node(type: int)");
	}

	public static String readInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String choiceString = br.readLine();
		return choiceString;

	}

	public static void printMessage(String _message) {
		System.out.println(_message);
	}
	
	public static void WriteOutput(Node _node) {
		System.out.println("Node: \n" + _node.getNodeName() + "\n"
				+ _node.getNodeValue());
	}
}
