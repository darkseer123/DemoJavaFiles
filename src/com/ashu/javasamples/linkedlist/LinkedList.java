package com.ashu.javasamples.linkedlist;

public class LinkedList {

	private Node header;
	
	public LinkedList( ) {
        header = new Node( null );
    }
	
	public boolean isEmpty( ) {
        return header.next == null;
    }
	
	public void makeEmpty( ) {
        header.next = null;
    }
	
	public LinkedListIterator zeroth( ) {
        return new LinkedListIterator( header );
    }
	
	public LinkedListIterator first( ) {
        return new LinkedListIterator( header.next );
    }
	
	public void insert( Object x, LinkedListIterator p ) {
        if( p != null && p.current != null )
            p.current.next = new Node( x, p.current.next );
    }
	
	public LinkedListIterator find( Object x ) {
        Node itr = header.next;
        
        while( itr != null && !itr.element.equals( x ) )
            itr = itr.next;
        
        return new LinkedListIterator( itr );
    }
	
	public LinkedListIterator findPrevious( Object x ) {
        Node itr = header;
        
        while( itr.next != null && !itr.next.element.equals( x ) )
            itr = itr.next;
        
        return new LinkedListIterator( itr );
    }
	
	public void remove( Object x ) {
        LinkedListIterator p = findPrevious( x );
        
        if( p.current.next != null )
            p.current.next = p.current.next.next;  // Bypass deleted node
    }
	
	public static void printList( LinkedList theList ) {
        if( theList.isEmpty( ) )
            System.out.print( "Empty list" );
        else {
            LinkedListIterator itr = theList.first( );
            for( ; itr.isValid( ); itr.advance( ) )
                System.out.print( itr.retrieveElement( ) + " " );
        }
        
        System.out.println( );
    }
	
	public static int listSize( LinkedList theList ) {
        LinkedListIterator itr;
        int size = 0;
        
        for( itr = theList.first(); itr.isValid(); itr.advance() )
            size++;
        
        return size;
    }
	
}
