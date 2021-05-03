package com.revature.models;

public abstract class Person implements Walkable, Joggable {//Why use a abstract class
	
		public String name;
		public int age;
		
		public Person() {
			super();
		}
		
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public void breath() {//not abstract because I want every person to breath the same way
			System.out.println(" I am taking a big breath");
		}
		
		//abstract method must be in abstract class
		public abstract String talk(String word);
		
		@Override
		public void trip() {
			Joggable.super.trip("south");
		}
}
