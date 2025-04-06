package com.multithreading;

public class ThreadDemo3 implements Runnable {
	@Override
	public void run() {
		
		System.out.println("My Thread");
		
	}
	
	public static void main(String[] args) {
		
		ThreadDemo3 th=new ThreadDemo3();
		
		Thread thread=new Thread(th);
		Thread th2=new Thread(th,"Ajay");
		
		thread.start();
		
		
		System.out.println("Main Thread");
		
	}

	

}
