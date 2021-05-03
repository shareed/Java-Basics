package com.revature;

import com.revature.throwables.*;


public class Driver {
	public static void main(String[] args) {
		System.out.println("The main method has started");
		
		try {
			throwChecked();
		} catch(MyException e) {//catch a MyException called e
			e.printStackTrace();
		} catch(Exception e) {//catch a MyException called e
			e.printStackTrace();
		}
		
		
		System.out.println("______________________________________________");
		
		try {
			throwUnchecked("I'm causing you problems");
			throwChecked();
		} catch(MyException e) {//catch a MyException called e
			System.out.println("I am in MyException");
			e.printStackTrace();
		} catch(Exception e) {//catch a MyException called e
			System.out.println("I could be any Exception");
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("The main method has ended");
	}
	
	public static void throwError() throws MyError {
		System.out.println("I'm about to throw an error");
		throw new MyError();
	}
	
	public static void throwChecked() throws MyException {
		System.out.println("I'm about to throw a checked exception");
		throw new MyException();
	}
	
	public static void throwUnchecked(String message) {
		System.out.println("I'm about to throw an unchecked exception");
		throw new MyUncheckedException(message);
	}

}
