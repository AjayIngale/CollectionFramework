 package com.sorting;

import java.util.Comparator;

public class NameDescComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		return employee2.getName().compareTo(employee1.getName()) ;
	}

}
