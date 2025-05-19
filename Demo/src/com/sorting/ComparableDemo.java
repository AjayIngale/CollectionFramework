package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	
	public static void main(String[] args) {
		
		List<Person>personList=new ArrayList<>();
		
		Person person1=new Person(1,"Ajay",25,70);
		
		personList.add(person1);
		personList.add(new Person(2, "Raj", 10, 60));
		personList.add(new Person(3, "Mahesh", 20, 55));
		personList.add(new Person(5, "Ramesh", 21, 100));
		personList.add(new Person(4, "Ram", 22, 80));
		
		System.out.println("Before Sort : ");
		
		for (Person person : personList) {
			System.out.println(person);
			}
		
		Collections.sort(personList);
      
		System.out.println("After Sort :");
		for (Person person : personList) {
			System.out.println(person);
			}
		
		
	}

}
