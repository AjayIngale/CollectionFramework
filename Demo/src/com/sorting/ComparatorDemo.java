package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorDemo {
	
	public static void main(String[] args) {
		List<Employee>empList=new ArrayList<>();
		 empList.add(new Employee(1, "Ajay", 30000));
		 empList.add(new Employee(2, "Vijay", 40000));
		 empList.add(new Employee(4, "Sujay", 80000));
		 empList.add(new Employee(3, "Sanjay", 10000));
		 empList.add(new Employee(5, "Ajay", 10000));
		 
		 System.out.println("Before Sort :");
		 
		 for ( Employee employee : empList) {
			System.out.println(employee);
		}
		 
		 // I want sort employees using employee Id
		 // Create IdComparator  class
		 // implement Comparator
		 // Ovride the method of comparator interface
		 // implement the logic 
		 
		 IdComparator idComparator=new IdComparator();
		 
		 Collections.sort(empList,idComparator);
		 
		 System.out.println("After Sort By Id : ");
		 for (Employee employee : empList) {
			System.out.println(employee);
		  }
		 
		 Collections.sort(empList, new NameComparator());
		 
		 System.out.println("Sort by Using Name : ");
		 
		 for (Employee employee : empList) {
			System.out.println(employee);
		}
		 
		 System.out.println("Sort by Using Name by descending: ");
		 Collections.sort(empList,new NameDescComparator());
		 
		 for (Employee employee : empList) {
			 
			 System.out.println(employee);
			
		}
		 
		 
		 
		 
	
		 
	}

}
