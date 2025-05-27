package com.predefined.Predicate;
// This Provides the Traditional Approach to Implement Interface Logic

interface MyPredicate {
	public  boolean isEven(int num);
}

class MyPredicateClass implements MyPredicate{

	@Override
	public boolean isEven(int num) {
		if(num%2==0)
			return true;
		else
		return false;
	}
	
	
}

public class MyPredicateTredDemo {
	
	public static void main(String[] args) {
		MyPredicateClass myPredicate=new MyPredicateClass();
		boolean isEven=myPredicate.isEven(10);
		System.out.println(isEven);
	}

}
