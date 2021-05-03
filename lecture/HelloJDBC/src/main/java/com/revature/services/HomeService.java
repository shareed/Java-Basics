package com.revature.services;

import java.util.List;

import com.revature.daos.HomeDAO;
import com.revature.daos.HomeDAOImpl;
import com.revature.models.Home;

public class HomeService {
	
	private HomeDAO homeDAO = new HomeDAOImpl();
	public List<Home> getAllHomes(){
		List<Home> list = homeDAO.findAll();
		
		//any business logic that would need to take place can happen here
		return list;
	}
	
	public Home findHomeByName(String name){
		return homeDAO.findByHomeName(name);
	}
	
	public boolean createHome(Home home) {
		if("Fury's secret bunker".equals(home.getName())) {
			return false;
		} else {
			return homeDAO.addHome(home);
		}
	}

}
