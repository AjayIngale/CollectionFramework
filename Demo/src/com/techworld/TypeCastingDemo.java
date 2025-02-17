package com.techworld;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		char c='A';
		
		int  num=c;
		
		long longNum=num;
		
		System.out.println(num);
		System.out.println(longNum);
		
		int num1=8000;
		
		float num2=num1;
		System.out.println(num2);
		
		
		float num3=1000.14F;
		System.out.println(num3);
		
		int num4=(int)num3;
		
		System.out.println(num4);
		
		int num5=66;
		
		char c1=(char) num5;
		System.out.println(c1);
	
	

	}

}
