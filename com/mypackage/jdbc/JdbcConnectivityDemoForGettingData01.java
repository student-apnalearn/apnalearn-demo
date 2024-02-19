package com.mypackage.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcConnectivityDemoForGettingData01 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_batch_3","root","root");
			//PreparedStatement pstmt;
			
			Statement stmt = conn.createStatement();
			String query1="select * from students where st_id =1";
			
			ResultSet rs=stmt.executeQuery(query1);
			while(rs.next()) {
				System.out.println(rs.getString("st_id"));
				System.out.println(rs.getString("st_name"));
				System.out.println(rs.getInt("st_age"));
			}
			
			System.out.println("query executed successfully.");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
