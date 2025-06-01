package com.interface8;

interface I2 {
	
	default public void m1() {
		
		System.out.println("From i2 Interface ");
	};
	
}

interface I3 {
	
	default public void m1() {
		System.out.println("From I3 Interface ");
	};
	
}


public class Test2 implements I2,I3 {
	
	public void m1() {
		
		I2.super.m1();
		I3.super.m1();
		
	}
	public static void main(String[] args) {
		
		Test2 t2=new Test2();
		t2.m1();
		
	}

}
