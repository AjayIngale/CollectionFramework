package com.introduction;

public class ThreadDemo {
	
public static void main(String[] args) {
	
	Runnable r=()->{
		for (int i = 0; i < 10; i++) {
		System.out.println("Child Thread"+i);
		}
		};
		
		Thread t1=new Thread(r);
		t1.start();
		
		for (int i = 0; i < 10; i++) {
		System.out.println("Main Thread"+ i);
		
	}
		
	Runnable r2=()->{
		System.out.println("Hello");
	};
	
	Thread t2=new Thread(r2);
	t2.start();
	
	
}

}
