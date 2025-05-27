package com.predefined.consumer;
@FunctionalInterface
interface Print1 {
	
	public void printString(String str);
}
public class ConsumerLambdaDemo {
	
	public static void main(String[] args) {
		
		Print1 print=(str)->System.out.println(str);
		
		print.printString("Hello");
		print.printString("TechWorld");
		
		
		
	}

}


//Consumer-->accept(T)
