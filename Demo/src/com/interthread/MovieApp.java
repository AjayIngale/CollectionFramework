package com.interthread;

public class MovieApp {
	
	public static void main(String[] args) {
		MovieEarnings t1=new MovieEarnings();
		
		t1.start();
		
		synchronized (t1) {
			try {
				t1.wait();
				System.out.println("Total Earning : "+t1.total);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
		
		
	
		
	}

}
