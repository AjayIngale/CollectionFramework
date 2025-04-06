package com.multithreading;
class MyThread6 extends Thread{
	
	public MyThread6(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(5000);
				
				
				System.out.println("MyThread :"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}
public class ThreadClassDemo {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread6 th1=new MyThread6("Ajay");
		th1.setName("Raj");
		th1.setPriority(1);
		th1.start();
		System.out.println(th1.getPriority());
		
		
		
		
		for (int i = 0; i < 10; i++) {
			//System.out.println(Thread.currentThread());
			Thread.sleep(1000);
			th1.interrupt();
			System.out.println("MainThread :"+i);
			
		}
		
	
		
	}
	
	

}
