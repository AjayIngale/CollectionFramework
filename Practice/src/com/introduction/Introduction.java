package com.introduction;

import java.util.function.Function;
import java.util.function.Predicate;

public class Introduction {
		
	public static void main(String[] args) {
		
		Function<Integer, Integer>squareIt=i->i*i;
		System.out.println("Square of number is 5 : "+squareIt.apply(5));
		System.out.println("Square of number is 6 : "+squareIt.apply(6));
		
		Predicate<Integer>isEvenTest=i->i%2==0;
		System.out.println(isEvenTest.test(12));
		System.out.println(isEvenTest.test(19));
	}

}
