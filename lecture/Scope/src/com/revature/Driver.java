package com.revature;

public class Driver {

		//Class Scoped primitive variable containing a static primitive
		static int i = 5;// value is the same across the entire class
		
		//Class Scoped primitive variable containing a static primitive, not yet initialized
		//has a default value, generally 0
		static int i2;// value is the same across the entire class
		
		//Class Scoped reference variable, not yet initialized
		// default value is null
		static Driver driverObject;
		//lets say I made a class that extends the driver class it would have access to this
		
		//Instance/Object scope variable
		double d2 = 18.95;
		
		
		public static void main(String[] args) {
			System.out.println("Class Scoped Static variable i: " + i);//5
			System.out.println("Class Scoped Static variable i2: " + i2);//0
			System.out.println("Class Scoped Reference variable driverObject: " + driverObject);//null
			System.out.println("============================================");
			System.out.println("                                            ");
			//System.out.println(d2); a static method cannot see the instance scope variables
			
			//initializing i2
			i2 = -98;
			
			//creates a new driver object stored in driverObject
			driverObject = new Driver();
			
			System.out.println(i);//5
			System.out.println(i2);//-98
			System.out.println(driverObject.i2);//-98 bad practice, should reference through the class
			System.out.println(driverObject);//will return location(eg. com.revatureDriver@2401f4c3
			System.out.println(driverObject.d2);//18.95
			System.out.println("============================================");
			System.out.println("                                            ");
			
			driverObject.i2 = 450;
			
			//When i2 is changed in one place the changes affect the entire class
			System.out.println(i2);//450
			System.out.println(driverObject.i2);//450
			System.out.println("============================================");
			System.out.println("                                            ");
			
			Driver driverObject2 = new Driver();
			
			driverObject2.d2 = 1234;
			
			System.out.println(driverObject);
			System.out.println(driverObject.d2);//18.95
			System.out.println(driverObject.i2);//450
			System.out.println(driverObject2);
			System.out.println(driverObject2.d2);//1234.0
			System.out.println(driverObject2.i2);//450 bad paractice
			
			driverObject2.example(true);
		}
		
		public void example(boolean b) {
			//everything inside this method has access to b and f
			System.out.println(b);
			float f = 25.8f;
			System.out.println(f);
			
			if(b) {
				//c is only accessible inside the if statement
				char c = 'c';
				System.out.println(c);
				System.out.println(f);
			}
			
			//this will not work
			//System.out.println(c);//c is blocked scoped inside the if statement and cannot be accessed anywhere else
			
		}
}

