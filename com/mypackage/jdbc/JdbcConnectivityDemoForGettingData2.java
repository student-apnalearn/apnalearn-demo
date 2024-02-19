package com.mypackage.jdbc;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectivityDemoForGettingData2 {
	public static void main(String[] args) {
		try {
			Connection conn = getConnection();
			CallableStatement cstmt = conn.prepareCall("call st_proc");
			cstmt.execute();
			ResultSet rs = cstmt.getResultSet();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			String columnNames[] = new String[columnCount];
			String columnTypes[] = new String[columnCount];
			String columnClassName[] = new String[columnCount];
			String columnLables[] = new String[columnCount];
			int columnDisplaySize[] = new int[columnCount];
			for (int i = 1; i <= columnCount; i++) {
				columnNames[i-1] = rsmd.getColumnName(i);
				columnTypes[i-1] = rsmd.getColumnTypeName(i);
				columnClassName[i-1] = rsmd.getColumnClassName(i);
				columnLables[i-1] = rsmd.getColumnLabel(i);
				columnDisplaySize[i-1] = rsmd.getColumnDisplaySize(i);
			}
			for (int i = 0; i < columnCount; i++) {
				System.out.println(columnNames[i] + " :: " + columnTypes[i] + " :: " + columnClassName[i] + " :: " + columnLables[i] + " :: " + columnDisplaySize[i]);
			}
			displayResultSet(rs);
			//5. Close the connection
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	static Connection getConnection() throws ClassNotFoundException, SQLException {
		//1. Load/Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. Get the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_batch_3", "root", "root");
		return conn;
	}
	static void printData(Statement stmt) throws SQLException {
		String query1 = "select * from students";
		ResultSet rs = stmt.executeQuery(query1);
		displayResultSet(rs);
	}
	static void displayResultSet(ResultSet rs) throws SQLException {
		while(rs.next()) {
			System.out.print(rs.getString("st_id") + " ::: ");
			System.out.print(rs.getString("st_name") + " ::: ");
			System.out.println(rs.getString("st_age"));
		}
	}
}