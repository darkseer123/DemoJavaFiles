package com.ashu.javasamples.tree;

class Node {

	public int element;
	public Node lptr;
	public Node rptr;
	
	public Node(int _element) {
		this(_element, null, null);
	}
	
	public Node (int _element, Node _lptr, Node _rptr) {
		this.element = _element;
		this.lptr = _lptr;
		this.rptr = _rptr;
	}
	
}
