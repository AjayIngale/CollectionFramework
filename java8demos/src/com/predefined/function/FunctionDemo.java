package com.predefined.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		Function<String, Integer>function=(str)->str.length();
		int lenghtofString=function.apply("Mahesh");
		
		
		System.out.println(lenghtofString);
		
		System.out.println(function.apply("Rajvardhan"));
		
		Function<Integer, Integer>squreIt=(num)->num*num;
		System.out.println(squreIt.apply(10));
		
		Function<Integer, Integer>cubeIt=(num)->num*num*num;
		
		System.out.println(cubeIt.apply(10));
		
		Function<String, String>capital=(name)->name.toUpperCase();
		System.out.println(capital.apply("suraj"));
		
		
		BiFunction<Integer, Integer, Integer>sumIt=(num1,num2)->num1+num2;
		System.out.println(sumIt.apply(10, 20));
		
		
	}

}
