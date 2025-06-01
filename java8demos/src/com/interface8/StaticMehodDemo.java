package com.interface8;

import java.util.function.Function;

interface I4 {
	
	public abstract void test();
	default void m2() {
		System.out.println("This default Method");
	};
	public static void hello () {
		System.out.println("static Method from interfcae ");
	}
}
public class StaticMehodDemo implements I4{

	@Override
	public void test() {
		System.out.println("This abstract Method");
		
	}
	
	public static void main(String[] args) {
		
		StaticMehodDemo sm=new StaticMehodDemo();
		sm.test();
		sm.m2();
		I4.hello();
		
		
		
	      System.out.println(Function.identity());
		
	}


}
