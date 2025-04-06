package com.multithreading;
// Creating Thread by Implementing Runnable Interface
class MyThread1 implements Runnable {
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("MyThread :" + i);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 thread = new MyThread1();
		Thread t1 = new Thread(thread);
        t1.start();

		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("Main Thread :" + i);

		}
     }
}
