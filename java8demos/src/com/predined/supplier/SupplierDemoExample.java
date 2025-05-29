package com.predined.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;


public class SupplierDemoExample {
	public static void main(String[] args) {
		
		Supplier<String>supplier=()->"TechWorld";
		
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		
		
		// To generate no
		
		Supplier<Double>supplier2=()->Math.random()*1000;
		
		System.out.println(supplier2.get());
		System.out.println(supplier2.get());
		
		
		List<Employee>empList=new ArrayList<>();
	     empList.add(new Employee(1, "Ajay", 20000));
		 empList.add(new Employee(2, "Suraj", 50000));
		 empList.add(new Employee(3, "Ram", 57000));
		 empList.add(new Employee(4, "Vikas", 57000));
		 
		 Supplier<Employee>emSupplier=()->new Employee();
		 
		emSupplier.get().getEmpId();
		
	}

}
