package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class EMS {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1, "Ajay",10000, "Developer");
		Employee emp2=new Employee(2, "Raj", 10400, "Tester");
		Employee emp3=new Employee(3, "Swaraj", 10400, "Tester");
		
		// Add employee to the List
		
		ArrayList<Employee>empList=new ArrayList<>(); //10-->5
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(new Employee(4, "Swapnil", 60000, "Hr"));
		
//		System.out.println(empList);
		
//		for(Employee emp:empList) {
//			
//			System.out.println(emp);
//		}
//		
//		for (Employee employee : empList) {
//			
//			employee.displayEmployee();
//			
//		}
		
		
		//empList.remove(2);
//		System.out.println("------------------------------------------------------------");
//		System.out.println(empList);
		
		ArrayList<Employee>testers=new ArrayList<>();
		
		for (Employee employee : empList) {
			if(employee.role=="Tester") {
				testers.add(employee);
			}
		}
		
		//System.out.println(testers);
		
		//empList.removeAll(testers);
		
		
		
		//empList.removeFirst();
		System.out.println(empList);
		System.out.println( empList.contains(emp1));
		
		System.out.println(empList.containsAll(testers));
		
		empList.ensureCapacity(15);
		
		List<Employee>reversedList=empList.reversed();
		System.out.println(reversedList);
		
		boolean isEmty=empList.isEmpty();
		
		System.out.println(isEmty);
		
		empList.trimToSize();
		
		Employee[] emparr= {emp1,emp2,emp3};
		
		 List<Employee>covFromArray = Arrays.asList(emparr);
		 

		 
		
		 
	
	
		
		
	

		

	}

}
