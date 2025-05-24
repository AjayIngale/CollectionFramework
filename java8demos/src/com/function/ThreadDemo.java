package com.function;


public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Runnable r1=()->{System.out.println("Hello From child thread");};
		Thread t1=new Thread(r1);
		t1.start();
		
		Runnable r2=()->{System.out.println("Hello From child Thread 2");};
		
	
		Thread t2=new Thread(r2);
		t2.start();
		Runnable r3=()->{
			
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				
			}
		};
		
		Thread t3=new Thread(r3);
		t3.start();
		
		
		System.out.println("Hello");
		
	}

}
