package com.synchonization;

public class MovieApp2 {
	
	public static void main(String[] args) {
		
		MovieTheator b1=new MovieTheator();
		Mythread1 t1=new Mythread1(7, b1);
		t1.start();
		
		
		Mythread1 t2=new Mythread1(7, b1);
		t2.start();
		MovieTheator b2=new MovieTheator();
		Mythread2 t3=new Mythread2(6, b2);
		
		t3.start();
		
         Mythread2 t4=new Mythread2(6, b2);
		
		t4.start();
		
		
		
	}

}
