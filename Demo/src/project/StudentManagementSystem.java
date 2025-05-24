package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentUtility studentUtility=new StudentUtility();
		List<Student>studentList=new ArrayList<>();
		
		
     while(true) {
    	 System.out.println("Student Management Program : ");
    	 System.out.println("============================================");
    	 System.out.println("1.Add Student \n2.Update Student\n3.Display All Students \n4.Delete Student \n61.sortStudents \n0.Exit");
    	 System.out.println("Please select your Option : ");
    	 int option=sc.nextInt();
    	 
    	 switch (option) {
    		case 1:
    			Student student=studentUtility.addStudent();
    			studentList.add(student);
    			System.out.println("Student with roll number "+student.getRollNo()+" Added Succefully ");
   
    		break;
    		case 2:
    			System.out.println("Enter Studet Roll to update : ");
    			int sId=sc.nextInt();
    			List<Student> updatedList=studentUtility.updateStudent(studentList,sId);
    			break;
    			
    		case 3:
    		  
    			studentUtility.displayStudents(studentList);
    			
    			
    			break;
    		case 4:
    			System.out.println("Enter Studet Roll to delete : ");
    			int sid=sc.nextInt();
    			studentList=studentUtility.deleteStudent(studentList, sid);
    			System.out.println("Student with roll Number "+sid+ "is suceesfully Deleted" );
    			System.out.println(studentList);
    			
    			break;
    		case 6:
    			System.out.println("Students after Sorting : ");
    		  List<Student>sortedStuent=studentUtility.getSortedStudent(studentList);
    		 sortedStuent.forEach(s->System.out.println(s));
	         case 5:
	        	
	        	System.exit(0);
    			
    			break;   
    			
	         

    		default:
    			System.out.println("Sorry.. No Option Found");
    			break;
    		}
    			
     }
	}

}
