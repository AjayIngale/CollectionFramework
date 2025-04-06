package com.multithreading;

class Mythread3 extends Thread{
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {  // Running State
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("RUNNING");
			System.out.println("My Thread :"+i);
			
		}
		
	}
}

public class ThreadStateDemo {
	public static void main(String[] args) throws InterruptedException {
		
		Mythread3 t1=new Mythread3();
		System.out.println(t1.getState()); // NEW STATE
		t1.start();
		
		System.out.println(t1.getState());  // RUNNABLE
		Thread.sleep(100);
		System.out.println(t1.getState()); //TIMED_WAITING
		t1.join();
		System.out.println(t1.getState());  //TERMINATED
	}

}
