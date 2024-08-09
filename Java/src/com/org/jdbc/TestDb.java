package com.org.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {
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
				Statement stm = connection.createStatement();
				ResultSet rs = stm.executeQuery("Select * from Student");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"	" +rs.getString(2)+"		"+rs.getString(3)+" 	"+rs.getString(4));
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
}
