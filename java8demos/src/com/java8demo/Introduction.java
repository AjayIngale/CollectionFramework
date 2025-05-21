package com.java8demo;

import java.util.function.Function;
import java.util.function.Predicate;

// calculate the square of the given number

// create Method  calculateSquare(int num)
// logic 
// call method and pass agrument

// Check the given numbers is even or not


public class Introduction {
	
  
	

	public static void main(String[] args) {
		Function<Integer, Integer>squareIt=num->num*num;
		System.out.println("Square of 10 :  "+squareIt.apply(10));
		System.out.println("Square of 20 :  "+squareIt.apply(20));
		
		
     	Predicate<Integer>isEvenTest=n->n%2==0;
		System.out.println("IsEven 10 :"+isEvenTest.test(10));
		System.out.println("IsEven 99 :"+isEvenTest.test(99));
		
		
		 }

}
 