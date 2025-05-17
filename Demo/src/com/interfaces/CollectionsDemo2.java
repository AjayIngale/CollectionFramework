package com.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
	
	public static void main(String[] args) {
		
		List<String>names=new ArrayList<>();
		names.add("Raj");
		names.add("Suraj");
		System.out.println(names);
		
		Collections.addAll(names, "Ram","Mahesh");
		
		System.out.println(names);
		
		List<String>names2=new ArrayList<>();
		names2.add("Sunil");
		names2.add("Anil");
		
		System.out.println(Collections.disjoint(names, names2));
	
		
	}

}
