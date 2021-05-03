package com.revature.models;


//Associate must implement abstract methods from the Person Class
//and the non concrete methods from the Interfaces that the Person class Implements
public class Associate extends Person {
	
	public String batch;
	
	public Associate() {
		super();
	}
	
	public Associate(String name, int age, String batch) {
		super(name, age);
		this.batch = batch;
	}
	
	@Override
	public String talk(String words) {
		//super allow you access to the parent's field and methods in the child class
		return super.name + "is saying '" + words + " '";
	}
	
	@Override
	public void move(int myDistance) {
		System.out.println("I walked " + myDistance + measurement + "miles today!!!");
	}
}
