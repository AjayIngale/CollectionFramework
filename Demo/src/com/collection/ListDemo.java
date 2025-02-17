package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
	
		List<Integer>intList=new ArrayList<>();
		
		intList.add(1);
		intList.add(2);
		intList.add(5);
		intList.add(5);
		//intList.add(null);
		intList.add(6);
		System.out.println(intList);
		
		for(int i=0;i<5;i++) {
			System.out.print(intList.get(i)+ " ");
		}
		System.out.println();

		for(int i: intList) {
			System.out.print(i+ " ");
		}
		System.out.println();

		intList.add(2,10);
		System.out.println(intList);
		
		System.out.println(intList.size());
		
		intList.remove(3);
		System.out.println(intList);
		
		System.out.println(intList.lastIndexOf(6));
		
		System.out.println(intList.contains(2));
		
		System.out.println(intList.isEmpty());
		
//		System.out.println(intList.remove(0));
//		System.out.println(intList);
		
		intList.removeFirst();
		intList.removeLast();
		System.out.println(intList);
		intList.addFirst(1000);
		intList.addLast(500);
		//intList.clear();
		System.out.println(intList);
		
		
//		List<String>names=new ArrayList<>();
//		names.add("Ajay");
//		names.add("Raj");
//		System.out.println(names);
		
		List<Integer>intList2=new ArrayList<>();
		
		intList2.add(1);
		intList2.add(6);
		
		System.out.println(intList2);
		
		//intList.addAll(intList2);
		
		intList.addAll(2, intList2);
		
		System.out.println(intList);
	
	}

}
