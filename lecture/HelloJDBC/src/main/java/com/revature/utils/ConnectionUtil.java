package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	//Connection method
	public static Connection getConnection() throws SQLException {// this throws declaration is for DriverManager.getConnection(url, username, password)
		//We need to register our driver, make the application aware if what 
		//particular Driver class we are using, is not required but it makes 
		//things easier when you are adding different things
		try {// register PostgreSQL Driver
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//"jdbc:postgresql://url to database:port/database name"
		//variable to hold location of database
		String url = "jdbc:postgresql://appian-210419.cicsaqdn7n8c.us-east-2.rds.amazonaws.com:5432/demos";
		
		
		//you can use environment variables to hide the raw valus to protect this information
		// using System.getenv("keyName")
		//you can also set the environment variables by right clicking the project and Run as then run config
		//variable to hole database username
		String username = "postgres";
		//variable to hole database password
		String password = "password";
		
		
		return DriverManager.getConnection(url, username, password);
	}
	
	
//	public static void main(String [] args) {
//		/*
//		 * Finally block are so commonly used to close resources(open connections outside of Java)
//		 * that there is a short cut to creating a finally block that does it called a `try with resources block`
//		 * that declares the resource to open and then close at(inside the curly braces) the try declaration
//		 */
//		
//		try(Connection conn = ConnectionUtil.getConnection()) {//try to establish a connection
//			System.out.println("Connection Successful");//if connection successful
//		} catch(SQLException e) {//if exception, catch exception and show the exception
//			e.printStackTrace();
//		}
//	}

}
