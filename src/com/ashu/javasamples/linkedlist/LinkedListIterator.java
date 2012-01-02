package com.ashu.javasamples.linkedlist;

public class LinkedListIterator {

	Node current;
	
	LinkedListIterator(Node _node) {
		current = _node;
	}
	
	public boolean isValid() {
		return current != null;
	}
	
	public Object retrieveElement () {
		return isValid() ? current.element : null;
	}
	
	public void advance() {
		if (isValid()) {
			current = current.next;
		}
	}
}
