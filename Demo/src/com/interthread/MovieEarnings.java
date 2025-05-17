package com.interthread;

public class MovieEarnings extends Thread {
	int total;
	
	@Override
	public void run() {
		
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				
				total=total+100;
				
			}
			this.notifyAll();
			
		}
	}
	
	

}
