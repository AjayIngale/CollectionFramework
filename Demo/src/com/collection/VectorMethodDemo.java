package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMethodDemo {
	public static void main(String[] args) {
		
		Vector<Integer>vector=new Vector<>(); // 10
		
		vector.addElement(10);
		vector.addElement(20);
		vector.addElement(30);
		vector.add(40);
		
		System.out.println(vector.capacity());
		
		System.out.println(vector);
		
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
//		vector.removeAllElements();
//		System.out.println(vector);
		
		vector.setElementAt(25, 2);
		System.out.println(vector);
		
		vector.set(2, 26);
		System.out.println(vector);
		
		vector.insertElementAt(22, 2);
		System.out.println(vector);
		
		Integer [] arr=new Integer[vector.size()];
				
		vector.copyInto(arr);
		
		for(Integer number:arr) {
			System.out.println(number);
		}
		
		
	}

}
