package com.revature.models;

public interface Joggable {
	
		//this is public and abstract, we do not need to specify it
		void move(int jog);
	
	    //this default method can be used in the implementing class
		//but the class does not have to implement it
		default void trip(String direction) {
			System.out.println("Oh no you tripped while jogging, " + direction + " are you ok!!!!");
		}
	

}
