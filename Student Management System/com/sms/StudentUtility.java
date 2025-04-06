package com.sms;

import java.util.Iterator;
import java.util.List;
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
	
	// To display student in proper format  // studentList
	
	public void displayStudentInfo(List<Student> studentList) {
		
		for(Student student :studentList) {
			System.out.println(student);
		}
	 }
	
	// Logic to delete the student
	
	public List<Student> deleteStudent(List<Student>studentList,int rollNo) {
		// This will Throw conCurrent Modification exception since we are iterating using for-each 
		//also trying to remove from the list.
	
//		for(Student student:studentList) {  
//			Student s=student;
//			if(s.getRollNo()==rollNo) {
//				studentList.remove(s);
//				System.out.println("Student is deleted");
//			}
//		}
		
		Iterator<Student> iterator = studentList.iterator();
	    while (iterator.hasNext()) {
	        Student student = iterator.next();
	        if (student.getRollNo() == rollNo) {
	            iterator.remove();  // Safe way to remove an element
	            System.out.println("Student is deleted");
	        }
	    }
		
		return studentList;
	}
	
	

}
