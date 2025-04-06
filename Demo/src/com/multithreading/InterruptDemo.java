package com.multithreading;

class MyThread9 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				//Thread.sleep(1000);
				System.out.println("MyThread  : "+i);
			} catch (Exception e) {
				
				System.out.println("Do some worlk");
			}
			
			
		}
	}
}

public class InterruptDemo {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread9 t9=new MyThread9();
		t9.start();
		t9.interrupt();
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("Main Thread : "+i);
			
		}
	}

}
