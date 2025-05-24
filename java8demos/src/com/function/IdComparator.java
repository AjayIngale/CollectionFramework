package com.function;

import java.util.Comparator;

public class IdComparator implements Comparator<Emlpoyee> {

	@Override
	public int compare(Emlpoyee emp1, Emlpoyee emp2) {
		// TODO Auto-generated method stub
		return emp1.getEmpId()-emp2.getEmpId();
	}

}
