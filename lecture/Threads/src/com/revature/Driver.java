package com.revature;

public class Driver {
	
	public static void main(String[] args) {
		MyMagicThread mmt1 = new MyMagicThread();
		mmt1.setPriority(1);//value can be 1 - 10, 1 is the lowest level
		
		MyMagicThread mmt2 = new MyMagicThread();
		mmt2.setPriority(2);
		
		//These do not create new threads because we did not use the start method
		//you should never call run method directly
		//mmt1.run();
		//mmt2.run();
		
		
		//you should call run through start
		mmt1.start();
		mmt2.start();
		
	}

}
