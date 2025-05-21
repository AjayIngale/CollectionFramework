package com.java8demo;

public class LamdaExprssion {
	public static void printHello() {
		System.out.println("Hello");
	}
	
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static int  add (int a,int b){

		return a+b;
		}
	
	
	public static void main(String[] args) {
		
		LamdaExprssion.printHello();
		
		LamdaExprssion.print("Raj");
		LamdaExprssion.print("Ajay");
		
	int sum=	LamdaExprssion.add(20, 30);
	
	System.out.println(sum);
		
		
	}
	
	

}
