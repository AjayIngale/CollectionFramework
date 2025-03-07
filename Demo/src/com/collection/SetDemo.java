package com.collection;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
	
		// Add 
		
		Set<Integer>set=new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(4);
		set.add(4);
		set.add(4);
	    set.add(4);
		set.add(4);
		set.add(null);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(15);
	
		System.out.println("Set--->"+set);
		
		
	//add All
		
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Set<Integer>set2=new HashSet<>();
		set2.addAll(list);
		set2.addAll(set);
		set2.add(100);
		System.out.println("Set2--->"+set2);
		
	// Remove
		
//		set2.remove(null);
//		set2.remove(30);
//		System.out.println("After Remove--->"+set2);
		
		set2.removeAll(list);
		System.out.println(set2);
		
		set2.clear();
		System.out.println("After Clear--->"+set2);
		
		Set<Integer>set3=new HashSet<>();
		set3.add(11);
		set3.add(22);
		set3.add(33);
		set3.add(44);
		set3.add(55);
		set3.add(66);
		
		System.out.println("set3--->"+set3);
		
		boolean isContain=set3.contains(13);
		
		System.out.println(isContain);
		
		Set<Integer>set4=new HashSet<>();
		set4.add(11);
		set4.add(22);
	
		System.out.println("set4--->"+set4);
		
		boolean isContainAll=set3.containsAll(set4);
		System.out.println(isContainAll);
		
		
		//HashSet<Integer>hs=new HashSet<>();

	}

}
