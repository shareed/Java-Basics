package com.revature.models;

public class SUV extends Car {
	
	public int seats;
	
	public SUV() {
		super();
		System.out.println("In SUV no args constructor");
	}
	
	
	public SUV(int tires, String color, double fuelLevel, int maxSpeed, int seats) {
		super(tires, color, fuelLevel, maxSpeed);
		this.seats = seats;
		System.out.println("In SUV 5 args constructor");
		
	}

	public void offRoading() {
		System.out.println("I'm driving in the dirt up a hill.");
	}
	
	//Method overriding, over rides the drive method in the Car class
	public String drive(int speed) {
		return "Drive from SUV speed is " + speed;
	}

}
