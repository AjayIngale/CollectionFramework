package com.predined.supplier;

@FunctionalInterface
interface MySuplierDemo{
	
	public  String getPassword();
}


public class MySupplierLambdaDemo {
	
	public static void main(String[] args) {
		MySuplierDemo mySuplierDemo=()->"Test@123";
		
		System.out.println(mySuplierDemo.getPassword());
		
	}
	

}


