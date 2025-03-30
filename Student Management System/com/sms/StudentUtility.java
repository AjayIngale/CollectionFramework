package com.sms;

import java.util.Scanner;

public class StudentUtility {
	
	// This Method is useful to add the student
	Scanner sc=new Scanner(System.in);
	public Student addStudent() {
		
		Student student=new Student();
		
		System.out.println("Enter Student Information :");
		System.out.println("Enter Roll Number : ");
		int rollNo=sc.nextInt();
		student.setRollNo(rollNo);
		
		System.out.println("Enter Student Name : ");
		sc.nextLine();
		String name=sc.nextLine();
		student.setName(name);
		
		System.out.println("Enter Marks of Student :");
		int marks=sc.nextInt();
		student.setMarks(marks);
		
		return student;
		
		
		}

}
