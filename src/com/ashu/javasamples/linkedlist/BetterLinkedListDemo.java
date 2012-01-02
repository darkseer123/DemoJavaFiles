package com.ashu.javasamples.linkedlist;

public class BetterLinkedListDemo {

	public static void main(String[] args) {
		LinkedList theList = new LinkedList();
		LinkedListIterator theItr;
		int i;

		theItr = theList.zeroth();
		LinkedList.printList(theList);

		for (i = 0; i < 10; i++) {
			theList.insert(new Integer(i), theItr);
			LinkedList.printList(theList);
			theItr.advance();
		}
		System.out.println("Size was: " + LinkedList.listSize(theList));

		for (i = 0; i < 10; i += 2)
			theList.remove(new Integer(i));

		for (i = 0; i < 10; i++)
			if ((i % 2 == 0) == (theList.find(new Integer(i)).isValid()))
				System.out.println("Find fails!");

		System.out.println("Finished deletions");
		LinkedList.printList(theList);
	}
}
