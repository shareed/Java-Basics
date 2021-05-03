package com.revature;

import java.util.Comparator;

import com.revature.models.Pokemon;

public class ComparePokeName implements Comparator<Pokemon> {

	@Override
	public int compare(Pokemon p1, Pokemon p2) {
		System.out.println("the compare methhod is running for " + p1.name + " and " + p2.name + " !!!!");
		
		//we want to sort 
		return p1.name.compareTo(p2.name);
	}

}
