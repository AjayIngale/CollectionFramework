package com.predefined.consumer;

interface Print {
	
	public void printString(String str);
}

class PrintWord implements Print{

	@Override
	public void printString(String str) {
	
	System.out.println(str);		
	}
	
	
}

//(str)->{System.out.println(str);}

public class ConsumerTredDemo {
	
	public static void main(String[] args) {
		
		PrintWord printWord=new PrintWord();
		printWord.printString("Hello");
		printWord.printString("TechWorld");
		
	}

}
