package com.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(0);
		list.add(22);
		
		System.out.println("Before Sort :"+list);
		
		Collections.sort(list);
		
		System.out.println("After Sort"+list);
	}

}
