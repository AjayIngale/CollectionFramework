package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		//SortedSet<Integer>ss=new TreeSet<>();
		TreeSet<Integer>ts=new TreeSet<>();
		 ts.add(10);
			ts.add(22);
			ts.add(44);
			ts.add(3);
			ts.add(3);
			
			System.out.println(ts);
			
		TreeSet<String>sts=new TreeSet<>();
		sts.add("Ajay");
		sts.add("Raj");
		sts.add("Mahesh");
		sts.add("Sumit");
		
		System.out.println(sts.first());
		System.out.println(sts.last());
		
		System.out.println(sts);
		
		
		for(String name:sts) {
			System.out.println(name);
		}
		
		System.out.println(ts.ceiling(44));
	}

}
