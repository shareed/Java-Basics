package com.revature.daos;

import java.util.List;

import com.revature.models.Home;

public interface HomeDAO {
	
	//get all the homes
	List<Home> findAll();
	
	//get a single home, you have to pass the primary key
	Home findByHomeName(String name);
	
	//boolean because it is successful or it is not 
	boolean addHome(Home home);
	
	//public boolean updateHome(Home home);

}
