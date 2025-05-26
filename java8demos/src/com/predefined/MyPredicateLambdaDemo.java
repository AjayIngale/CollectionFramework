package com.predefined;
// This User defined  functional Interface   used for Lamda Demo
@FunctionalInterface
interface MyPredicateDemo {
	public  boolean isEven(int num);
}
public class MyPredicateLambdaDemo {
	public static void main(String[] args) {
		MyPredicate myPredicate=(num)->num%2==0;
		boolean isEven=myPredicate.isEven(10);
		System.out.println(isEven);
		
	}

}
