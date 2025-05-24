package project;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;

public class StudentUtility {
	
	public Student addStudent() {
		
		Student student=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Information : ");
		Consumer<Student> setRollNo = s -> {
            System.out.println("Enter Student rollNo : ");
            s.setRollNo(sc.nextInt());
        };
        
		Consumer<Student>setName=s->{
		System.out.println("Enter Student Name : ");
		sc.nextLine();
		s.setName(sc.nextLine());
		};
		
		Consumer<Student>setMarks=s->{
		System.out.println("Enter Student Marks : ");
		s.setMarks(sc.nextInt());
		};
		setRollNo.andThen(setName).andThen(setMarks).accept(student);
		return student;
		
	}
	
	
	public void displayStudents(List<Student> studentList) {
		System.out.println("Student Information : ");
		studentList.forEach(s->System.out.println(s));
	 }
	
	
	public List<Student> deleteStudent(List<Student> studentList,int sId) {
		studentList.removeIf(s->s.getRollNo()==sId);
		return studentList;
	 }


	public List<Student> updateStudent(List<Student> studentList, int sId) {
		
		Optional<Student>studentOpt=studentList.stream().filter(s->s.getRollNo()==sId).findFirst();
		
		studentOpt.ifPresent(student->{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student Name : ");
			String name=sc.nextLine();
			student.setName(name);
			System.out.println("Enter Student Marks : ");
			int marks=sc.nextInt();
			student.setMarks(marks);
			System.out.println("Student is Updated Suscessfully");
			
			});
		
		return  studentList;
	}


	public List<Student> getSortedStudent(List<Student> studentList) {
		
		//studentList.sort(Comparator.comparing(Student::getRollNo));
		
		 // Collections.sort(studentList,new StudentIdComparator());
		 
//		  Collections.sort(studentList,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student s1, Student s2) {
//				// TODO Auto-generated method stub
//				return s1.getRollNo()-s2.getRollNo();
//			}
//			  
//			  
//		  });
		


		
		return studentList;
	}
	
	

}
