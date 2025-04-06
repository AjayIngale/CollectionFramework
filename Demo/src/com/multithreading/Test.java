package com.multithreading;

// Creating  Thread by extending the Thread class
//Step 1
class MyThread extends Thread {

	// Step : 2
   @Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("MyThread :" + i);

		}

	}
}

public class Test {
	public static void main(String[] args) throws InterruptedException {

		// Step: 3
		MyThread t1 = new MyThread();
		MyThread t2=new MyThread();
		// Step : 4
		t1.start(); //
		t2.start();
        for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("Main Thread :" + i);

		}

		System.out.println("Main Thread");

	}

}
