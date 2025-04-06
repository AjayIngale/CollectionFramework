package project;

import java.util.List;

import java.util.Scanner;

public class StudentUtility {
	
	public Student addStudent() {
		
		Student student=new Student();
		
		System.out.println("Enter Student Information : ");
		System.out.println("Enter Student rollNo : ");
		Scanner sc=new Scanner(System.in);
		int rollNo=sc.nextInt();
		student.setRollNo(rollNo);
		System.out.println("Enter Student Name : ");
		sc.nextLine();
		String name=sc.nextLine();
		student.setName(name);
		System.out.println("Enter Student Marks : ");
		int marks=sc.nextInt();
		student.setMarks(marks);
		System.out.println(student);
		return student;
		
	}
	
	
	public void displayStudents(List<Student> studentList) {
		System.out.println("Student Information : ");
		for (Student student : studentList) {
			
			System.out.println(student);
		}
	 }
	
	
	public List<Student> deleteStudent(List<Student> studentList,int sId) {
		
		for (Student student : studentList) {
		    Student s= student;
		    if(s.getRollNo()==sId) {
		    	studentList.remove(s);
		    	
		    	
		    }
		    
		}
		
		System.out.println(studentList);
		return studentList;
	 }


	public List<Student> updateStudent(List<Student> studentList, int sId) {
		
		
		for (Student student : studentList) {
		   
		    if(student.getRollNo()==sId) {
		    	System.out.println("Enter Student Information : ");
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Student Name : ");
			
				String name=sc.nextLine();
				student.setName(name);
				System.out.println("Enter Student Marks : ");
				int marks=sc.nextInt();
				student.setMarks(marks);
				System.out.println("Student is Updated Suscessfully");
				return studentList;
		    	
		    }
		    
		}
		return studentList;
	}
	
	

}
