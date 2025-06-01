package com.interface8;

interface I1{
	public abstract void m1();
	public abstract void m2();
	default void m3() {
		System.out.println("M3 from interface");
	};
	
	int a=0;
	public static final int max_no=100;
	
	 
}

class  A implements I1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	public void m3 (){
		
		System.out.println("M3 from class A");
		}
	
}

class B implements I1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	
}


class C implements I1 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	
}



class Z implements I1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
public void m3 () {
	
	System.out.println("M3 from z");
}
	
}

public class Test {
	

	
	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		Z z=new Z();
		
		a.m3();
		b.m3();
		z.m3();
		
	
		System.out.println("Interface");
		
		
		
		
		
		
		
		
	}

	
}
