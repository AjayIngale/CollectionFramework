package com.synchonization;

public class MovieTheator {
	
	static int totalSeats=20;
	
	static synchronized  void bookSeats(int seats) {
		  
		  System.out.println(Thread.currentThread().getName()+"Watching the mall");
		  System.out.println(Thread.currentThread().getName()+"Doing shoppimng");
	
			
			if(totalSeats>=seats) {
				 
				System.out.println("Seats booked successfully");
				 System.out.println(Thread.currentThread().getName()+"watching Moview");
				totalSeats=totalSeats-seats;
				System.out.println("Total Seats Available :"+totalSeats);
			}
			else {
			
				System.out.println("Unable to book seats");
				 System.out.println(Thread.currentThread().getName()+" Not able to book Moview");
			}
			
		}
		
	}
		
	
	
	


