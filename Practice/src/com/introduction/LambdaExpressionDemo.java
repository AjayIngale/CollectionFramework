package com.introduction;
@FunctionalInterface
interface interf{
	
	public void print(String s); 
}

public class LambdaExpressionDemo {
	public static void main(String[] args) {
		
		interf i=(s)->System.out.println(s);
		
		i.print("Hello");
		i.print("Test");
		
		
	}

}