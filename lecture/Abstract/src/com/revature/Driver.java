package com.revature;

import com.revature.models.*;

public class Driver {
	
	public static void main(String[] args) {
		//can not create a new Person because the class is abstract
		//Person shannon = new Person("Shannon", 23, "210419");
		
		Person shannon = new Associate("Shannon", 23, "210419");
		
		System.out.println(shannon.talk("I love to code"));
		
		//Person has no access to batch so this will not work
		//System.out.println(shannon.batch);
	}

}
