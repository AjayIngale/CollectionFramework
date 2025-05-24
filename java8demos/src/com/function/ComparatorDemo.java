package com.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		
		List<Emlpoyee>empList=new ArrayList<>();
		
		empList.add(new Emlpoyee(1,"Ajay") );
		empList.add(new Emlpoyee(2,"Vijay") );
		empList.add(new Emlpoyee(5,"Sanjay") );
		empList.add(new Emlpoyee(4,"Raj") );
		empList.add(new Emlpoyee(6,"Sujay") );
		
		System.out.println("Before Sort :");		
		
//		for (Emlpoyee emlpoyee : empList) {
//			System.out.println(emlpoyee);
//		}
		
		empList.forEach((s)->System.out.println(s));

		
		Collections.sort(empList,new NameComparator() {
		});
		
//		for (Emlpoyee emlpoyee : empList) {
//			System.out.println(emlpoyee);
//		}
		
		empList.forEach((s)->System.out.println(s));
		
	}

}
