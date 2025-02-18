package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		// Construtor 1 
		// Constructs an empty vector so that its internal data array
		 //has size 10 and its standard capacity increment is zero.
		Vector<Integer>numbers=new Vector<>();  //intial Capacity =10
		System.out.println(numbers.capacity());
	
		// Constructor 2 :
		//Constructs an empty vector with the specified initial capacity
		//and with its capacity increment equal to zero
		Vector<Integer>numbers1=new Vector<>(15);  //intial Capacity =15
		System.out.println(numbers1.capacity());
		
		
		// Constructor 3 :
		//Constructs an empty vector with the specified initial capacity and capacity increment.
		Vector<Integer>numbers2=new Vector<>(25, 5); //intial Capacity =25
		System.out.println(numbers2.capacity());
	
		// Constructor 4 :
		List<Integer>intList=new ArrayList<>();
		intList.add(10);
		intList.add(20);
		//Constructs a vector containing the elements of the specified collection,
		//in the order they are returned by the collection's iterator.
		Vector<Integer>numbers3=new Vector<>(intList);
		System.out.println(numbers3.capacity());
		
		
		

		
	}

}
