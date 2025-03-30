package com.sms;

public class Student {
	// Create required fields
	
	private int rollNo;
	private String name;
	private int marks;
	
	// Constructors
	// Default constructor // para-less
    public Student() {
    }
    // parameterized
    public Student (int rollNo,String name,int Marks)
    {
    	this.rollNo=rollNo;
    	this.name=name;
    	this.marks=marks;
    }
    
    // getters and Setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	// toString()
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
    

   }
