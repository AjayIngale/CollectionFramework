package com.sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		
		return employee1.getName().compareTo(employee2.getName()) ;
	}

}
