package com.java8demo;


import java.util.function.BiFunction;

public class CalculatorTest {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer,Integer>addition=(num1,num2)->num1+num2;
		int add=addition.apply(10, 20);
		System.out.println("Sum :"+add);	
		
		BiFunction<Float, Float, Float>addFloat=(num1,num2)->num1+num2;
		
		float sumFloat=addFloat.apply(10.5F, 10.6f);
		
		System.out.println(sumFloat);

	}

}
