package com.pratyush.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	
	public static void main(String[] args) {
		
		try {
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
			System.out.println(connection);
			Statement statement = connection.createStatement() ;	
			int result = statement.executeUpdate("insert into account values(1, 'Shukla', 'Pratyush', 10000)") ;
			System.out.println(result+ " rows got inserted !!");
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}