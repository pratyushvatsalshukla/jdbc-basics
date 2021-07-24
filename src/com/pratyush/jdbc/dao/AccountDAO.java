package com.pratyush.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	
	public static void main(String[] args) {
		
		try {
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
			System.out.println(connection);
			Statement statement = connection.createStatement() ;	
			ResultSet rs = statement.executeQuery("select * from account") ;
			while(rs.next()) {
				System.out.print(rs.getString(2)+ " ");
				System.out.print(rs.getString(3)+ " ");
				System.out.print(rs.getInt(4));
				System.out.println();
			}
			
		} 
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
