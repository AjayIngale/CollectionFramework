package com.multithreading;



//Thread 1
class Mythread12 extends Thread {
 @Override
 public void run() {
	 Thread.yield();
     try {
        // Simulate delay
         for (int i = 0; i <= 10; i++) {
        	 
         	 Thread.sleep(1000); 
             System.out.println("Mythread-1 " + i);
         }
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}

//Thread 2
class Mythread13 extends Thread {
	
	
 @Override
 public void run() {
     for (int i = 11; i <= 20; i++) {
    	 try {
			Thread.sleep(1000);
			 System.out.println("Mythread-2 " + i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
     }
 }
}

//Main class
public class YeildDemo {
 public static void main(String[] args) throws InterruptedException {
     Mythread12 th1 = new Mythread12();
     Mythread13 th2 = new Mythread13();
     Thread.State state = th1.getState();
     System.out.println(state);
         // Start Thread 2
        
     th1.start(); 
   
     
     th2.start();
     
     // Then start Thread 1
 }
}
