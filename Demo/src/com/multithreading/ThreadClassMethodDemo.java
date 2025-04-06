package com.multithreading;

//Step 1
class Thread7 extends Thread{
	
	
	//Step 2: 
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(5000);
			
			System.out.println("Hello From th7");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}

class Thread8 extends Thread{
	
	//Step 2: 
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	System.out.println("Hello From th8");
	}
	
}

public class ThreadClassMethodDemo {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		//Step 3
		
		Thread7 th7=new Thread7();
		th7.setName("Shyam");
		th7.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Th7 or Shyam Thread : "+th7.getPriority());
		 System.out.println(th7.getName());
		 System.out.println(th7.getId());
		 
		Thread8 th8=new Thread8();
		th8.setName("Raj");
		th8.setPriority(Thread.MAX_PRIORITY);
		System.out.println("th8 or Raj Thread : "+th8.getPriority());
		
		System.out.println();
		 System.out.println(th8.getName());
		 System.out.println(th7.getState());
		 
		 
		//step 4
		th7.start();
		 System.out.println(th7.getState());
		th8.start();
		
		System.out.println(Thread.currentThread());
		
		System.out.println(th7.isAlive());
	    //th7.interrupt();
		th7.join();
		System.out.println(th7.isAlive());
		System.out.println(th7.getState());
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
	}

}
