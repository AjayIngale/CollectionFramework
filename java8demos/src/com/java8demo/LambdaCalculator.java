package com.java8demo;

@FunctionalInterface
interface Calculate{
	
	public int operate(int num1,int num2);
}
public class LambdaCalculator {
	public static void main(String[] args) {
		
		// Addition
		
		Calculate addition=(num1,num2)->num1+num2;
		System.out.println("Sum : "+addition.operate(10, 20));
		
		Calculate substraction=(num1,num2)->num1-num2;
		System.out.println("Sub :"+substraction.operate(20, 10));
		
		Calculate multiplication=(num1,num2)->num1*num2;
		System.out.println("Sub :"+multiplication.operate(10, 20));
		
		Calculate division=(num1,num2)->num1/num2;
		int div=division.operate(20, 10);
		System.out.println("Div :"+div);
		
		
	}

}
