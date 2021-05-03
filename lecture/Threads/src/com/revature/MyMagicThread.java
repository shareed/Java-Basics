package com.revature;

public class MyMagicThread extends Thread {
	
	@Override
	public void run() {//overriding the Thread class's run method
		
		for(int i = 0;i < 10; ++i) {
			System.out.println(Thread.currentThread().getName() + " is working.....");//Thread.currentThread().getName() gets the current threads name
		
			
			//this is to slow down the console printing so that we can see what's happening
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		
		
		}
	}

}
