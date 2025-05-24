package com.java8demo;
@FunctionalInterface
interface runnable1{
	
	public void printHello();
	
}

class Demo implements runnable1{

	@Override
	public void printHello() {
		System.out.println("Hello");
		
	}
	
}

public class Test {
	public static void main(String[] args) {
		
		Demo demo=new Demo();
		demo.printHello();
		
	}

}
