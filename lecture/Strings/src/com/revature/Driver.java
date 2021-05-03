package com.revature;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		StringBuffer s10 = new StringBuffer("Hello Java");
		//String Literals
		String s1 = "Hello Java";
		String s2 = "Hello Java";
		String s3 = "hello java";
		String s4 = new String("Hello Java");
		
		System.out.println("String Literal vs new String:");
		System.out.println(s1 == s2);//true, have the same memory location
		System.out.println(s1 == s3);//false, they do not have the same memory location
		System.out.println(s1 == s4);//false, they do not have the same memory location
		System.out.println(s1.equals(s4));//true, the values are the same
		System.out.println(s10.equals(s4));
		System.out.println("_______________________________________________________");
		System.out.println("                                                       ");
		
		System.out.println(s1.toLowerCase().equals(s3));// true, the values are the same
		System.out.println(s1);//"Hello Java"
		System.out.println("_______________________________________________________");
		System.out.println("                                                       ");
		
		String s5 = s1.toLowerCase();
		System.out.println("String toLowerCase method example:");
		System.out.println(s5 == s3);//false, s5 and s3 are not located at the same memory address
		System.out.println("_______________________________________________________");
		System.out.println("                                                       ");
		
		
		char c1 = s1.charAt(4);
		System.out.println("String charAt method example:");
		System.out.println(c1);
		System.out.println("_______________________________________________________");
		System.out.println("                                                       ");
		
		String s6 = s1.concat(" ").concat(s3);// 5 different strings, s1, s3, " ", s1.concat(" "), s1.concat(" ").concat(s3)
		String s7 = s1 + " " + s3;
		System.out.println("String concat method example:");
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s6.equals(s7));//true
		System.out.println("_______________________________________________________");
		System.out.println("                                                       ");
		
		String[] arr = s1.split(" ");
		System.out.println("String split method example:");
		//enhanced for loop
		for(String string: arr) {//for each String called string in arr
			System.out.println(string);
		}
		
		String s8 = arr[0]+arr[1];
		System.out.println(s8);
		
		char[] charArr = s8.toCharArray();
		
		for(char c: charArr) {
			System.out.println(c);
		}
		
		System.out.println("Scanner example");
		System.out.println("Enter text below:");
		scannerMethod();
	}
	
	public static void scannerMethod() {
		Scanner scan = new Scanner(System.in); //System.in represents the console
		String s1 = scan.nextLine();
		
		System.out.println(s1);
		
		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.println("Hello " + name + " its good to meet you!!!");
		
		System.out.println("What is your age?");
		int age = scan.nextInt();//nextInt grabs the integer but leaves the new line character which requires us to clear it with nextLine
//		scan.nextLine();
		System.out.println(name + " you do not look " + age + " at all!!! What is your secret?");
		
		String secret = scan.nextLine();
		System.out.println(secret + " is your secret, Wow thanks I will try that!!!!");
	}
}
	

