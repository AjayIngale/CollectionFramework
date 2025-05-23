
package com.java8demo;
@FunctionalInterface
interface addInterface{
	public int add (int num1,int num2);
}

public class Addtion {
	
	public static void main(String[] args) {
		
		addInterface addInterface=(num1,num2)->num1+num2;
		int sum=addInterface.add(10,20);
		System.out.println(sum);
		
		}

}
