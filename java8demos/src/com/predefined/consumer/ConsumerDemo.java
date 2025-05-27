package com.predefined.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
		Consumer<String>print=(str)->System.out.println(str);
		//print.accept("Hello");
		//print.accept("TechWorld");
		
		List<Employee>empList=new ArrayList<>();
	     empList.add(new Employee(1, "Ajay", 20000));
		 empList.add(new Employee(2, "Suraj", 50000));
		 empList.add(new Employee(3, "Ram", 57000));
		 empList.add(new Employee(4, "Vikas", 57000));
		 
		
		 
		 empList.forEach((employee)->System.out.println(employee));
		 empList.forEach((employee)->System.out.println(employee.getEmpName().toUpperCase()));
		 empList.forEach((employee)->System.out.println(employee.getSalary()));
		 
		
	    BiConsumer<String, String>concatstring=(str1,str2)->System.out.println(str1.concat(str2));
	    concatstring.accept("Ajay", "Ingale");
	    
	    BiConsumer<Integer, Integer>sum=(num1,num2)->System.out.println(num1+num2);
	        sum.accept(10, 20);
		 
		 
		 
	     
	}

}
