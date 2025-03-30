package com.sms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[] args) {
		List<Student>studentList=new ArrayList<>();
		
		
		while(true) {
			System.out.println("***Student Management System ***");
			System.out.println("1.Add Student \n2.Update Student\n3.Display All Students \n4.Delete STudent \n5.exit");
			System.out.println("Please Select Option : ");
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			switch (option) {
			case 1:  // Add
				StudentUtility studentUtility=new StudentUtility();
				Student student=  studentUtility.addStudent();
				studentList.add(student);
				System.out.println("Student added Succefully");
				break;
	        case 2: //update 
	        	System.out.println("Update Student");
				break;
				
	         case 3:  // display all the students
	        	System.out.println(studentList);
				break;
				
	         case 4:  // Delete the student
	        	 System.out.println("Delete Student");
	 			break;
	 			
	 			
	         case 5:  // Exit
	        	 
	        	 System.exit(0);
	 			
	 			break;

			default:
				System.out.println("Please Enter Valid Options");
				break;
			}
		}
		
	}

}
