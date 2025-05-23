package com.java8demo;
@FunctionalInterface
interface calculate{
	
	public int operate(int num1,int num2);
}

class Addition implements calculate {

	@Override
	public int operate(int num1, int num2) {
		return num1+num2;
		
		}
	
}
// (int num1,int num2)->{return num1+num2;};

//(num1,num2)->num1+num2;
// calculate calulate=(num1,num2)->num1+num2;
// calculate.operate(10,20);

class Substraction implements calculate {

	@Override
	public int operate(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
	
}
//(int num1,int num2)->{return num1-num2;}
//(num1,num2)->num1-num2;



class Multiplcation implements calculate {

	@Override
	public int operate(int num1, int num2) {
		
		return num1*num2;
	}
	
	
}

//(int num1,int num2)->{return num1*num2;}
//(num1,num2)->num1*num2;


class Division implements calculate {

	@Override
	public int operate(int num1, int num2) {
		
		return num1/num2;
	}
	
}
// (int num1,num2)->{return num1/num2;};
//(num1,num2)->num1/num2;

public class Calculator {
	
	public static void main(String[] args) {
		
		Addition addition=new Addition();
		int sum=addition.operate(10, 20);
		System.out.println("Sum :"+sum);
		
		Substraction substraction=new Substraction();
		int sub=substraction.operate(20, 10);
		System.out.println("Sub :"+sub);
		
		Multiplcation multiplcation=new Multiplcation();
		int mult=multiplcation.operate(20, 10);
		System.out.println("Mult :"+mult);
		
		Division division=new Division();
		int div=division.operate(20, 10);
		System.out.println("Div :"+div);
		
		
	
		
	}

}
