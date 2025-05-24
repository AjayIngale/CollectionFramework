package com.function;

import java.util.Comparator;

public class NameComparator implements Comparator<Emlpoyee> {

	@Override
	public int compare(Emlpoyee emp1, Emlpoyee emp2) {
	
		return emp1.getName().compareTo(emp2.getName());
	}

}
