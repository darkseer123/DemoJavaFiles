package com.ashu.javasamples.bst;

class Node {

	private String name;
	private int value;

	private Node lptr;
	private Node rptr;

	Node() {
		this.name = "";
		this.value = 0;
		this.lptr = null;
		this.rptr = null;
	}

	Node(int _value) {
		this.name = "Dummy";
		this.value = _value;
		this.lptr = null;
		this.rptr = null;

	}

	Node(String _name, int _value) {
		this.name = _name;
		this.value = _value;
		this.lptr = null;
		this.rptr = null;
	}

	public String getNodeName() {
		return this.name;
	}

	public int getNodeValue() {
		return this.value;
	}
	
	public Node getLPTR() {
		return this.lptr;
	}

	public Node getRPTR() {
		return this.rptr;
	}
	
	public void setLPTR(Node n) {
		this.lptr = n;
		
	}

	public void setRPTR(Node n) {
		this.rptr = n;
	}
}
