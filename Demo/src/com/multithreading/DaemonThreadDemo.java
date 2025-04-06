package com.multithreading;

class MyThread8 extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Deamon thread");
	}
}

public class DaemonThreadDemo {
	
	public static void main(String[] args) {
		
		MyThread8 t=new MyThread8();
		t.setDaemon(true);
	
	     t.start();
	    
	}

}
