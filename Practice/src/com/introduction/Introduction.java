package com.introduction;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Introduction {
		
	public static void main(String[] args) {
		
		Function<Integer, Integer>squareIt=i->i*i;
		System.out.println("Square of number is 5 : "+squareIt.apply(5));
		System.out.println("Square of number is 6 : "+squareIt.apply(6));
		
		Predicate<Integer>isEvenTest=i->i%2==0;
		System.out.println(isEvenTest.test(12));
		System.out.println(isEvenTest.test(19));
		
		BiFunction<String, String, String>comp=(s1,s2)->s1.concat(s2);
		System.out.println(comp.apply("Ajay", "Ingale"));
		
		BiConsumer<String, String>print=(s1,s2)->System.out.println(s1+" "+s2);
	     print.accept("Ajay","Ingale");
	     
	     BiPredicate<Integer, Integer>test=(num1,num2)->num1>num2;
	    System.out.println(test.test(10, 20));
	    System.out.println(test.test(30, 20));
	    
	    BooleanSupplier getBool=()->10%2==0;
	    System.out.println(getBool.getAsBoolean());
	    
	    Consumer<Integer>consumer=(num1)->System.out.println(num1*num1);
	    consumer.accept(10);
	    
	    Function<Integer, Integer>cube=(num1)->num1*num1*num1;
	    System.out.println(cube.apply(10));
	}

}
