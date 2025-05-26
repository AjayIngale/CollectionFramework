package com.function;



import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLambda {
	public static void main(String[] args) {
		
		List<Emlpoyee>empList=new ArrayList<>();
		
		empList.add(new Emlpoyee(1,"Ajay") );
		empList.add(new Emlpoyee(2,"Vijay") );
		empList.add(new Emlpoyee(5,"Sanjay") );
		empList.add(new Emlpoyee(4,"Raj") );
		empList.add(new Emlpoyee(6,"Sujay") );
		
		System.out.println("Before sort :");
		empList.forEach(s->System.out.println(s));
		
		//Comparator<Emlpoyee>IdComparator=(emp1,emp2)->emp1.getEmpId()-emp2.getEmpId();
		//Comparator<Emlpoyee>DescComparator=(emp1,emp2)->emp2.getEmpId()-emp1.getEmpId();
		
		Comparator<Emlpoyee>nameComparator=(emp1,emp2)->emp1.getName().compareTo(emp2.getName());
		
		Collections.sort(empList,nameComparator);
		System.out.println("After Sort :");
		
		empList.forEach(s->System.out.println(s));
		
		
		
	}

}
