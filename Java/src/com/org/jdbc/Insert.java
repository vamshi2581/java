package com.org.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Insert {
	private static final String URL="jdbc:mysql://Localhost:3306/TcsTraining";
	private static final String USER="root";
	private static final String PASSWORD="Root123$";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
	public static void main(String[] args) {
		int count=0;
		try (Connection connection = getConnection()){
			if(connection!=null) {
				System.out.println("Connected to database");
				PreparedStatement ps = connection.PrepareStatement("insert into values(?,?,?,?)");
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
}
