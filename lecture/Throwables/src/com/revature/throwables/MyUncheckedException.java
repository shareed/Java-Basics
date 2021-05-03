package com.revature.throwables;

//UnChecked Exception
public class MyUncheckedException extends RuntimeException {
	
	public MyUncheckedException() {
		super();
	}
	
	public MyUncheckedException(String message) {
		super(message);
	}

}
