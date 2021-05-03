package com.revature.services;

import java.util.List;

import com.revature.daos.AvengerDAO;
import com.revature.daos.AvengerDAOImpl;
import com.revature.models.Avenger;

public class AvengerService {
	
	private AvengerDAO avengerDAO = new AvengerDAOImpl();
	
	public List<Avenger> avengerAssemble() {
		
		return avengerDAO.findAll();
	}

}
