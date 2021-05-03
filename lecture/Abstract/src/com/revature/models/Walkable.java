package com.revature.models;

public interface Walkable {
	
	String measurement = "miles";
	//this is public and abstract, we do not need to specify it
	void move(int distance);
	
	//this default method can be used in the implementing class
	//but the class does not have to implement it
	default void slowdown() {
		System.out.println("The person is slowing down!!!!");
	}
	
	//this default method can be used in the implementing class
	//you would need to override it if the same method signature exist 
	//in another interface that is implemented in the same class
	default void trip() {
		System.out.println("Oh no you tripped while walking, are you ok!!!!");
	}
	
	

	

}
