package com.techworld;

public class Employee {
	
	int empId;
	String name;
	double salary;
	String role;
	
	public Employee() {
		
	}
	
	 public Employee(int empId,String name,double salary,String role) {
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		this.role=role;
	 }
	 
	 public int getEmpId() {
		 return this.empId;
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 
	 public double getSalary() {
		 return this.salary;
	 }
	 
	 public String getRole() {
		 return this.role;
	 }
	 
	 public void setEmpId(int empId) {
		 this.empId=empId;
	 }

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public void displayEmployee() {
		
		System.out.println("EmpId="+this.empId+"Emaplpee Name = "+this.name+"Salary="+this.salary+"Role ="+this.role);
		
	}

//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", role=" + role + "]";
//	}
//	
	
}
