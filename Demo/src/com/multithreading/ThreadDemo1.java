package com.multithreading;



public class ThreadDemo1  extends Thread{
	
	@Override
	public void run() {
	for (int i = 0; i < 10; i++) {
		try {
			
			Thread.sleep(1000);
			System.out.println("MyThread : "+i);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
		
	}
	}

	public static void main(String[] args) throws InterruptedException {
		
		ThreadDemo1 t1=new ThreadDemo1();
		
		   t1.start();
		   Thread.sleep(1000);
		   for (int i = 0; i < 10; i++) {
				System.out.println("MainThread : "+i);
				
			}
		   		
		System.out.println("Main Thread");

	}

}
