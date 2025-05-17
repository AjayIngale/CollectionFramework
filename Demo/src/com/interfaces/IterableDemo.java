package com.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterableDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer>numbers=new ArrayList<>();
		 numbers.add(10);
		 numbers.add(20);
		 numbers.add(30);
		 numbers.add(40);
		 
//		 System.out.println(numbers);
//		 
//		for(Integer number:numbers) {
//			System.out.println(number);
//		}
		
		ArrayList<String>names=new ArrayList<>();
	   names.add("ajay");
	   names.add("vijay");
	   names.add("sanjay");
	   
//	   for(String name:names) {
//		   System.out.println(name);
//	   }
//	   
	   
	    Iterator<Integer>itr=numbers.iterator();
	    
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	    
	  Iterator<String>itr2= names.iterator();
	  
	  while(itr2.hasNext()) {
		  System.out.println(itr2.next());
	  }
	  
	  
	  //
	  
//	  
//	   for (Integer number :numbers ) {
//		   
//		   numbers.remove(number);
//		
//	   }
	   
	  
	    Iterator<Integer>itrNumbers= numbers.iterator();
	    
	    while(itrNumbers.hasNext()) {
	    	itrNumbers.next();
	    	
	    	itrNumbers.remove();
	    	 
	    }
	    
	    System.out.println(numbers);
	    
	    
		
	      
	}

}
