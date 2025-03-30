package project;

public class Student {
	// Fields of the class 
	private int rollNo;
	private String name;
	private int marks;
	
	// Default Constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	// Paramertized Constructor
   public Student(int rollNo,String name,int marks) {
	   this.rollNo=rollNo;
	   this.name=name;
	   this.marks=marks;
	   
	   
   }
// Getters
public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

//Setters
public void setName(String name) {
	this.name = name;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

//ToString Method
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
}
   
   
}
