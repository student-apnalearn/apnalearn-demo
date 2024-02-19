package com.mypackage.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectivityDemoForGettingData{
	public static void main(String[] args){
		try {
			//1. Load/Register the driver
			Class.forName ("com.mysql.cj.jdbc.Driver");
			//2. Get the connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_batch_3", "root","root");

			//3. Prepare the Statement/PreparedStatement/CallableStatement 
			Statement stmt = conn.createStatement();
			//PreparedStatement pstmt;
			String query1 = "select * from students";

			//4. Execute the query
			ResultSet rs = stmt.executeQuery(query1);
			while (rs.next()){
				System.out.println(rs.getString("st_id"));
				System .out.println(rs.getString("st_name"));
				System.out.println(rs.getString("st_age"));
			}
			String query2 = "update students set st_name = 'Rahul' where st_id=1";
			stmt.executeUpdate(query2);	
			
			rs = stmt.executeQuery(query1);
			while(rs.next()) {
				System.out.println(rs.getString("st_id"));
				System.out.println(rs.getString("st_name"));
				System.out.println(rs.getString("st_age"));
			}

			//5. Close the connection
			conn.close();
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();

		}
	}
}
