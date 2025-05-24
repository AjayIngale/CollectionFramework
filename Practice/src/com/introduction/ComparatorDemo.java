package com.introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ComparatorDemo {
	
	public static void main(String[] args) {
		List<Employee>empList=new ArrayList<>();
		 empList.add(new Employee(1, "Ajay", 30000));
		 empList.add(new Employee(2, "Vijay", 40000));
		 empList.add(new Employee(4, "Sujay", 80000));
		 empList.add(new Employee(3, "Sanjay", 10000));
		 empList.add(new Employee(5, "Ajay", 10000));
		 
		 empList.forEach((employee)->System.out.println(employee));
		 
		 Collections.sort(empList, (e1,e2)->e1.getEmpId()-e2.getEmpId());
		 
		empList.forEach((employee)->System.out.println(employee));
	}

}
