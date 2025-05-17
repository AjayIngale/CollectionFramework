package com.multithreading;

// Thread 1
class Mythread10 extends Thread {
    @Override
    public void run() {
        try {
           // Simulate delay
            for (int i = 0; i <= 10; i++) {
            	 Thread.sleep(4000); 
                System.out.println("Mythread-1 " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Thread 2
class Mythread11 extends Thread {
    @Override
    public void run() {
        for (int i = 11; i <= 50; i++) {
            System.out.println("Mythread-2 " + i);
        }
    }
}

// Main class
public class JoinMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Mythread10 th1 = new Mythread10();
        Mythread11 th2 = new Mythread11();

            // Start Thread 2
           
        th1.start(); 
        th1.join();
        th2.start();// Then start Thread 1
    }
}
