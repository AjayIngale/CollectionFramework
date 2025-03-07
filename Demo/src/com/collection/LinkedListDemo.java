package com.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<Integer>ll=new LinkedList<>();
	
	ll.add(10);
	ll.addFirst(20);
	ll.add(30);
	ll.addLast(10);
	ll.add(null);
	
	System.out.println(ll.peek());
	System.out.println(ll.peekFirst());
	System.out.println(ll.peekLast());
	LinkedList<Integer>reveresed=ll.reversed();
	System.out.println(ll);
	System.out.println(reveresed);
	
	
	

	


	}

}
