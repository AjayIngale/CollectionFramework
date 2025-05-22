package com.java8demo;
@FunctionalInterface
interface interf{
	
	public void printHello(); // Hello  //yes ---> It single abstract method
	
}



public class Test {
	public static void main(String[] args) {
		
		
		
		interf i=()-> {System.out.println("Hello");};
		
	}

}
