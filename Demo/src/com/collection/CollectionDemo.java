package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		Collection<Integer>collectionList=new ArrayList<Integer>();
		
		collectionList.add(1);
		collectionList.add(2);
		collectionList.add(3);
		collectionList.add(4);
		collectionList.add(5);
		collectionList.add(6);
		collectionList.add(7);
		collectionList.add(8);
		
		System.out.println(collectionList);
		
		collectionList.clear();
		
		System.out.println(collectionList);
		
		collectionList.add(11);
		collectionList.add(21);
		System.out.println(collectionList);
		
		boolean istrue= collectionList.contains(1);
		
		System.out.println(istrue);
		
		System.out.println(collectionList.isEmpty());
		collectionList.add(55);
		System.out.println(collectionList);
		
		System.out.println(collectionList.size());
		
		
		System.out.println(collectionList);
		
		Collection<Integer>collectionList2=new ArrayList<Integer>();
		System.out.println(collectionList2);
		
		collectionList2.addAll(collectionList);
		
		System.out.println(collectionList2);
		
		collectionList2.removeAll(collectionList);
		System.out.println(collectionList2);
		
	}

}
