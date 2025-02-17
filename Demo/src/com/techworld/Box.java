package com.techworld;

import java.util.List;

public class Box<T>  {
	
	T value;
	
	public Box (T value) {
		this.value=value;
	}
	
	public T getValue() {
		
		return value;
	}
	
public void setValue(T newValue) {
		
		this.value=newValue;
	}


	public static void main(String[] args) {
		
		Box<String>stringBox=new Box<String>("Ajay");
		System.out.println(stringBox.getValue());
		
		Box<Integer>intBox=new Box<Integer>(10);
		System.out.println(intBox.getValue());
	
		
		 
		 }

}
