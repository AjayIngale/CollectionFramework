package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetMathDemo {
	
	public static void main(String[] args) {
		
		Set<Integer>set1=new HashSet<>();
		set1.add(11);
		set1.add(22);
		set1.add(144);
		set1.add(13);
		set1.add(14);
		
		Set<Integer>set2=new HashSet<>();
		set2.add(11);
		set2.add(22);
		set2.add(44);
		set2.add(55);
		set2.add(144);
		set2.add(13);
		set2.add(14);
		
		//A-->10,20,30
		//B-->1,2,10
		//A U B--->10,20,30,1,2
		//A ^ B---> 10
		
		//Union of two sets
		
		set1.addAll(set2);
		
		//set1.retainAll(set2);
		
		System.out.println("set1 U set2---->"+set1);
		
		//System.out.println("set1 ^ set2--->"+set1);
	}

}
