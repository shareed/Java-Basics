package com.revature.throwables;

//Custom Error Class
public class MyError extends Error{//makes MyError an Error subclass
	
	
	public MyError() {//constructor that calls the parent class constructor
		super();
	}
	
	public MyError(String arg) {
		super(arg);
	}
	
	

}
