package com.synchonization;

public class Mythread2 extends Thread {
	int seats;
	static MovieTheator b;
	
	public Mythread2(int seats,MovieTheator b) {
		this.seats=seats;
		this.b=b;
	}
	@Override
	public void run() {
		b.bookSeats(seats);
	}

}
