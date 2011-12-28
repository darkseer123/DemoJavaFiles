package com.ashu.javasamples.bst;

import java.io.IOException;

public class BinarySearchTreeDemo {

	/**
	 * @param args
	 *            none
	 * @throws IOException
	 *             - Reading input from console
	 */
	public static void main(String[] args) throws IOException {

		BinarySearchTree bst = new BinarySearchTree();

		while (true) {
			TerminalUI.showMainMenu();
			int choice = Integer.parseInt(TerminalUI.readInput());

			switch (choice) {
			case 1:
				bst.insertNode();
				break;
			default: TerminalUI.printMessage("Not yet implemented");
			}

		}

	}

}
