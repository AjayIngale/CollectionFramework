package com.collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Index "+stack.get(3));
		
		System.out.println(stack);
		
	   System.out.println( stack.peek());
	   
	   System.out.println(stack.isEmpty());
	   
	   System.out.println(stack.search(10));
	   
	   for(Integer num:stack) {
		   System.out.println(num);
	   }
	}

}
