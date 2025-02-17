package com.techworld;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// Store the  marks of 100 Student
		int a=80;
		int b=20;
		
		// Arrays
		
		int [] arrMarks=new int[100];
		arrMarks[0]=37;
		arrMarks[1]=100;
		arrMarks[2]=89;
		arrMarks[99]=10;
		//arrMarks[88]=12.5;	
		
		Integer [] arrMarks1=new Integer[100];
		
		
		// Collections
		
		List<Integer>arrList=new ArrayList<>();
		arrList.add(10);
		arrList.add(30);
		arrList.add(40);
		arrList.remove(0);
		System.out.println(arrList);
		
		
		

	}

}
