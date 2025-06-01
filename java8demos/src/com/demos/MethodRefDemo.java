package com.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefDemo {
	
	public static void main(String[] args) {
		
		List<Integer>numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(31);
		numbers.add(40);
		numbers.add(43);
		
for (Integer num : numbers) {
	System.out.println(num);
}
    System.out.println("Print Using Lambda");
    numbers.forEach(s->System.out.println(s));
    
    System.out.println("Print Using Method Refrence ");
    
    numbers.forEach(System.out::println);
    
    
 List<Integer>envenNumbers=   numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
 System.out.println(envenNumbers);
 
 
 numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
 
 numbers.stream().map(n->n*n).forEach(System.out::println);
 
    
	 
	}
	


}
