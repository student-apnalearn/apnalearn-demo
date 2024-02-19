package com.mypackage.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*insert, update , delete  -DML commands
 * 
 * 1) Create a Connection.
 * 2) Create a Statement.
 * 3)Execute Statement.
 * 4)close Connection
*/

public class MYSQLDMLCommands {
	public static void main(String[] args) throws SQLException {
		//1) Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_batch_3", "root","root");
		
		// 2) Create a Statement/Query
		Statement stmt = con.createStatement();
		//String s = "INSERT INTO STUDENTS VALUES(5,'Raj',25)";
		
		String s = "UPDATE  STUDENTS SET st_name ='PN' where st_id =1";
		 
		 //3)Execute Statement/Query
		 stmt.execute(s);
		 
		 //4)close Connection
         con.close();
		 
		 
		 System.out.println("Query is executed..");
		
	}

}
