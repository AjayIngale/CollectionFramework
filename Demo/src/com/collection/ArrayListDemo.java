package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		// Create  list of 10 integers
		
		ArrayList<Integer>arrList=new ArrayList<>();
		
	      // Adding the element
		
//		arrList.add(10);
//		arrList.add(20);
		
		for(int i=0;i<=9;i++) {
			arrList.add(i+1);
		}
		
		//System.out.println(arrList);
		
		for(int i=0;i<=9;i++) {
			System.out.println(arrList.get(i));
		}
		
		arrList.removeLast();
		System.out.println(arrList);
		
	List<Integer>reverseList=arrList.reversed();
	System.out.println();
		
	
ArrayList<Integer>newList=new ArrayList<>();
      newList.add(10);
      newList.add(55);
      newList.add(2);
      
      System.out.println(newList);
      
      Collections.sort(newList);
      
      System.out.println(newList);
      
	}
	
	List<Integer>list;
	
	ArrayList<Integer>arrlist2=new ArrayList<>(12);

}
