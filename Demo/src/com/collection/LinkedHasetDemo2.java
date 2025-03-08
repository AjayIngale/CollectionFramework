package com.collection;

import java.util.LinkedHashSet;

public class LinkedHasetDemo2 {

	public static void main(String[] args) {
	LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
		
		lhs.add(10);
		lhs.add(22);
		lhs.add(44);
		lhs.add(3);
		lhs.add(3);
		lhs.add(null);
		
	    lhs.addFirst(100);
       
       System.out.println(lhs);
       
       for(int num:lhs) {
    	   System.out.println(num);
       }

	}

}
