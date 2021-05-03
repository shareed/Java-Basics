package com.revature;

import com.revature.models.Car;
import com.revature.models.SUV;
public class Driver {

	public static void main(String[] args) {
		Integer myNum = 4;
		Integer myNum1 = 4;
		Integer myNum2 = 5;
		Integer myNum3 = 11;
		 System.out.println(myNum.equals(myNum1)); 
		//Car here has to be import
		Car myCar = new Car("Black", 4);// the new keyword calls the constructor
		Car myCar2 = myCar;
		Car myCar1 = new Car("Black", 4);
		System.out.println(myCar == myCar1);
		System.out.println(myCar.equals(myCar2));
//		System.out.println("myCar memory location: " + myCar);
//		System.out.println("myCar color: " + myCar.color);
//		System.out.println("myCar maxSpeed: " + myCar.maxSpeed);
//		System.out.println("============================================");
//		System.out.println("                                            ");
//		
//		Car newCar = new Car(4, "Purple", 0.5, 420);
//		
//		System.out.println("newCar memory location: " + myCar);
//		System.out.println("newCar tires: " + newCar.tires);
//		System.out.println("newCar color: " + newCar.color);
//		System.out.println("newCar max speed: " + newCar.maxSpeed);
//		System.out.println("newCar fuel level: " + newCar.fuelLevel);
//		System.out.println("============================================");
//		System.out.println("                                            ");
//		
//		SUV mySUV = new SUV(5, "Yellow", 1.0, 120, 8);
//		
//		System.out.println("mySUV memory location: " + mySUV);
//		System.out.println("mySUV tires: " + mySUV.tires);
//		System.out.println("mySUV color: " + mySUV.color);
//		System.out.println("mySUV max speed: " + mySUV.maxSpeed);
//		System.out.println("mySUV fuel level: " + mySUV.fuelLevel);
//		System.out.println("mySUV seats: " + mySUV.seats);
//		System.out.println("============================================");
//		System.out.println("                                            ");
//		
//		mySUV.offRoading();
//		
//		
//		//UpCasting
//		Car coolSUV = new SUV(5, "Green", 1.0, 90, 4);
//		// coolSUV = myCar; this breaks the downcasting
//		
//		((SUV)coolSUV).seats = 7;
//		//DownCasting
//		SUV newSUV = (SUV) coolSUV;
//		
//		if(coolSUV instanceof SUV) {
//			System.out.println("YAAAASSSSS");
//		}
//		
//		System.out.println(coolSUV);
//		System.out.println(coolSUV.color);
//		System.out.println(newSUV.seats);
//		System.out.println(coolSUV.maxSpeed);
//		System.out.println("============================================");
//		System.out.println("                                            ");
//		
//		
//		System.out.println(newCar.drive(30));
//		System.out.println(newSUV.drive(100));
//		System.out.println(coolSUV.drive(50));
//		
		
		
		
	}

}
