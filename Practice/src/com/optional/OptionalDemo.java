package com.optional;

import java.util.Optional;

//Java program without Optional Class

public class OptionalDemo {
 public static void main(String[] args)
 {
     String[] words = new String[10];
   
     
     if(words[5]!=null) {
    	  String word = words[5].toLowerCase();
    	 System.out.print(word);
     }
     
     else
    	 System.out.println("It has null value");
    
    Optional<String>isNullable=Optional.ofNullable(words[5]);
        if(isNullable.isPresent()) {
        	 String word = words[5].toLowerCase();
        	 System.out.print(word);
        }
        else 
        	System.out.println("It has null value");
    
 }
}
