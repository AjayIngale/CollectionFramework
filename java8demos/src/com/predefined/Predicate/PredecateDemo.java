package com.predefined.Predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
// Here I  have used  Predefined Functional Interface Predicate<T>
public class PredecateDemo {
	
	public static void main(String[] args) {
	Predicate<Integer>predicate=(num)->{return num%2==0;};
	boolean isEven2=predicate.test(10);
	System.out.println(isEven2);
	
	Predicate<String>predicateString=(s)->{return s.length()<5;};
	boolean isStringLengthLessThan5=predicateString.test("RajKumar");
	
	System.out.println(isStringLengthLessThan5);

	
	BiPredicate<Integer, Integer>biPredicate=(num1,num2)->{return num1>num2;};
	System.out.println(biPredicate.test(10, 20));
	System.out.println(biPredicate.test(20,10));
	
	}
   
}
