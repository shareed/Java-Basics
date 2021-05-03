package com.revature.models;

public class Car {
	
	public int maxSpeed;
	public double fuelLevel;
	public int tires;
	public String color;
	
	
	//No args constructor
	public Car() {
		super();
		this.tires = 4;
		this.color = "Yellow";
		this.fuelLevel = 0.9;
		this.maxSpeed = 100;
		System.out.println("In Car no args constructor");
		
	}
	
	//Constructor1(2 args contructor)
	public Car(int newTires, String dealerColor) {
		/**the call to super is done by the compiler, 
		 * but it is best practice to add it yourself, and it calls 
		 * the parent Object class which has a no args constructor
		 */
		super();
		tires = newTires;
		color = dealerColor;
		
	}
	
	//Constructor overloading
	public Car(String color, int tires) {
			super();
			this.tires = tires;
			this.color = color;
			this.fuelLevel = 0.9;
			this.maxSpeed = 100;
			System.out.println("In String int constructor");
			
			
	}
		
	
	
	//Constructor2(4 args contructor)
	public Car(int tires, String color, double fuelLevel, int maxSpeed) {
		
		//this calls Constructor1
		this(tires, color);//
		
		//this calls the instance or class scoped variables
		this.maxSpeed = maxSpeed;
		this.fuelLevel = fuelLevel;
		System.out.println("In int, String, double, int constructor");
		
	}
	
	public String drive(int speed) {
		return "Drive from Car speed is " + speed;
	}
	
	
	
	
}
