package com.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	
	public static void main(String[] args) {
		List<Employee>empList=new ArrayList<>();
		 empList.add(new Employee(1, "Ajay", 30000));
		 empList.add(new Employee(2, "Vijay", 40000));
		 empList.add(new Employee(4, "Sujay", 80000));
		 empList.add(new Employee(3, "Sanjay", 10000));
		 
	   for (Employee employee : empList) {
		   System.out.println(employee);
		
	    }
	   
	   Collections.sort(empList);
	   
	 
	   
	   
	   System.out.println("After Sort");
	   
	   for (Employee employee : empList) {
		   System.out.println(employee);
		
	    }
	}
	

}
