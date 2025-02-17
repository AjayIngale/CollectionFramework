package com.techworld;

interface EmployeeInterface {
	
	public void test();
	
}

interface Manager extends EmployeeInterface{
	
}

class Empoyee implements Manager{

	@Override
	public void test() {
		
	System.out.println("Hello Team");
		
	}
	
	
}

public class InheitanceDemo {

	public static void main(String[] args) {
		EmployeeInterface empInterface=new Empoyee();
		
		empInterface.test();
		
		Empoyee emp=new Empoyee();
		emp.test();
		
		Manager manager=new Empoyee();
		
		manager.test();
		
		
	
	}
}
