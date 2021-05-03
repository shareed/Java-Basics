package com.revature.daos;

import java.sql.Connection;//this is a package in the JRE
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Home;
import com.revature.utils.ConnectionUtil;

public class HomeDAOImpl implements HomeDAO {

	@Override
	public List<Home> findAll() {
		//1. Connection to database
		try(Connection conn = ConnectionUtil.getConnection()) {
			String sqlQuery = "SELECT * FROM homes;";//SQL Statement
			
			//2.Create
			//Statement
			Statement statement = conn.createStatement();
			
			//ResultSet comes from JDBC and is the object that SQL returns,
			//and is designed to work with a while loop
			//object of type ResultSet
			ResultSet result = statement.executeQuery(sqlQuery);
			
			List<Home> list = new ArrayList<>();
			
			//returns a boolean and moves the cursor to that object
			while(result.next()) {
				
				//goes through each home and create a new home object and set the appropiate fields
				//home_name is the name of the column
				Home home = new Home();
				home.setName(result.getString("home_name"));
				home.setStNum(result.getString("hb_st_num"));
				home.setStName(result.getString("hb_st_name"));
				home.setCity(result.getString("hb_city"));
				home.setRegion(result.getString("hb_region"));
				home.setZip(result.getString("hb_zip"));
				home.setCountry(result.getString("hb_country"));
				//you could set the residents but we do not have the methods yet
				
				//Add the home info to the list of homes
				list.add(home);
				
				
				}
			//return list
			return list;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Home findByHomeName(String name) {
		//1. Connection to database
				try(Connection conn = ConnectionUtil.getConnection()) {
					//String sqlQuery = "SELECT FROM homes WHERE home_name =" + name +;";//SQL Statement
					String sqlQuery = "SELECT * FROM homes WHERE home_name = ?;";//SQL Statement
					//2.Create a prepared statement
					//Statement
					PreparedStatement statement = conn.prepareStatement(sqlQuery);
					
					statement.setString(1, name);//putting name where the 1st ? is in the sql query
					
					
					//ResultSet comes from JDBC and is the object that SQL returns,
					//and is designed to work with a while loop
					//object of type ResultSet
					ResultSet result = statement.executeQuery();
					
					Home home = new Home();
					
					while(result.next()) {
						home.setName(result.getString("home_name"));
						home.setStNum(result.getString("hb_st_num"));
						home.setStName(result.getString("hb_st_name"));
						home.setCity(result.getString("hb_city"));
						home.setRegion(result.getString("hb_region"));
						home.setZip(result.getString("hb_zip"));
						home.setCountry(result.getString("hb_country"));
						}
					return home;
					
				} catch(SQLException e) {
					e.printStackTrace();
				}
				return null;
	}
	

	@Override
	public boolean addHome(Home home) {
		//1. Connection to database
		try(Connection conn = ConnectionUtil.getConnection()) {
		
			String sqlQuery = "INSERT INTO homes (home_name, hb_st_num, hb_st_name, hb_city, hb_zip, hb_region, hb_country)"
								+ "VALUES(?,?,?,?,?,?,?);";//SQL Statement
			
			PreparedStatement statement = conn.prepareStatement(sqlQuery);//put the string in the prepared statement
			
			int index = 0;//I need to use an index to fill in the ? from the sqlQuery
			statement.setString(++index, home.getName());//these should match the order you have them in the SQL statement
			statement.setString(++index, home.getStNum());
			statement.setString(++index, home.getStName());
			statement.setString(++index, home.getCity());
			statement.setString(++index, home.getZip());
			statement.setString(++index, home.getRegion());
			statement.setString(++index, home.getCountry());
			
			
			
			//not executeQuery because we are not getting anything from the database
			statement.execute();//excute returns a boolean, but its not useful here
			
			return true;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;//can put it here or inside the catch, but it makes things easier 
	}

}
