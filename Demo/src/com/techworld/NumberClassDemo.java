package com.techworld;

public class NumberClassDemo {
	public static void main(String[] args) {
		Number number=new Integer(10);
		 System.out.println(number);
		Number doubleValue=new Double(20.10);
		
		Integer num1=10;
		
		int num2=num1;
		
		Integer num3=10;
		Integer num4=12;
		
	System.out.println(	num4.compareTo(num3));
	
	int max=Integer.max(10, 20);
	int min=Integer.min(10,6);
	System.out.println(max);
	System.out.println(min);
	
	int sum =Integer.sum(10, 10);
	System.out.println(sum);
	
	Character ch='A';
	char ch1=ch.charValue();
	
	int value=Character.compare('A', 'B');
	System.out.println(value);
		
	boolean isdigit=Character.isDigit('A');
	System.out.println(isdigit);
	
	char c='a';
	
	char ch2=Character.toUpperCase(c);
	System.out.println(ch2);
	System.out.println(Character.toLowerCase(ch2));
		
	}

}
