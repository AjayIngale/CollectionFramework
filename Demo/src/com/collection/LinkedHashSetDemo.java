package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
		
		lhs.add(10);
		lhs.add(22);
		lhs.add(44);
		lhs.add(3);
		lhs.add(3);
		lhs.add(null);
		
	System.out.println(lhs);
		
	HashSet<Integer>hs=new HashSet<>();
	hs.add(10);
	hs.add(22);
	hs.add(44);
	hs.add(3);
	hs.add(3);
	hs.add(null);
	
    System.out.println(hs);
    
    TreeSet<Integer>ts=new TreeSet<>();
    
    ts.add(10);
	ts.add(22);
	ts.add(44);
	ts.add(3);
	ts.add(3);
	//ts.add(null);
	
	 System.out.println(ts);
	
	}

}
