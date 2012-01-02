package com.ashu.javasamples.linkedlist;

class Node {

	public Node(Object _element) {
		this(_element, null);
	}

	public Node(Object _element, Node _node) {
		this.element = _element;
		this.next = _node;
	}

	public Object element;
	public Node next;
}
