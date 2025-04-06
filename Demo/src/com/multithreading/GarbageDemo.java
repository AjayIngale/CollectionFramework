package com.multithreading;

public class GarbageDemo {
	public static void main(String[] args) {
		String s="Ajay";
		System.out.println(s);
		s=null;  // garbage collection
		String s1="Vijay";
		System.out.println(s1);
		
	}
	

}
