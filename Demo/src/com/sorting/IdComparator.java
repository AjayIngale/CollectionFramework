package com.sorting;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		
		return employee1.getEmpId()-employee2.getEmpId();
	}

}
