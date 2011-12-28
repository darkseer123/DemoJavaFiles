package com.ashu.javasamples;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		for (int i : arr) {
			l.push(l.createNode(i));
		}

		System.out.println("Popping: ");
		l.pop(arr.length - 1);

		System.out.println("The linked list is: ");
		l.displayList();

	}
}

class LinkedList {
	private static Node front;
	private static Node rear;

	LinkedList() {
		front = rear = null;
	}

	public Node createNode(int info) {
		return new Node(info);
	}

	public void push(Node n) {
		if (front == null) {
			front = rear = n;
		} else {
			rear.next = n;
			rear = n;
		}
	}

	public void pop(int n) {

		if (front == null) {
			System.out.println("The list is empty");
			return;
		}

		for (int i = 0; i < n; i++) {
			Node temp = front;
			front = front.next;
			temp.next = null;
			temp = null;
		}
	}

	public void displayList() {
		Node temp = front;
		while (temp != null) {
			System.out.println(temp.info);
			temp = temp.next;
		}
	}
}

class Node {
	int info;
	Node next;

	Node(int i) {
		this.info = i;
		this.next = null;
	}
}
