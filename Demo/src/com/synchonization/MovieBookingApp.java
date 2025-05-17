package com.synchonization;

public class MovieBookingApp extends Thread {
	static MovieTheator b;
	int seats;
	
	@Override
	public void run() {
		b.bookSeats(seats);
	}
	
	public static void main(String[] args) {
		MovieBookingApp ajay=new MovieBookingApp();
		// b=new MovieTheator();
		ajay.seats=7;
		ajay.start();
		
		MovieBookingApp vijay=new MovieBookingApp();
		vijay.seats=7;
		vijay.start();
		
	}

}
