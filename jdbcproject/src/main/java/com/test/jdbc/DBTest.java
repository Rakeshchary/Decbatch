package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args)throws Exception {
		
		//Load Driver Class Name
		//Class.forName( "com.mysql.jdbc.Driver");
		Connection connection = DBUtil.getDBConnection();//DriverManager.getConnection("jdbc:mysql://localhost:3306/decdb","root","password@1234");
        
		Connection connection1 = DBUtil.getDBConnection();
		//Performing DB
		Statement stmt = connection.createStatement();
		/*stmt.execute("Create Table Persons" +"(PersonID int,"+"LastName varchar(255),"+"FirstName varchar(255),"+"Address varchar(255),"+"City varchar(255));");
		System.out.println("Table Created Successfully");*/
		
		//Insert
		/*int result = stmt.executeUpdate("INSERT INTO Persons VALUES (9856,'Suri','PA','IND','ANG')");
		System.out.println(" Inserted " + result + " Records Sucessfully in DB");*/
		
		//Update
		/*int result = stmt.executeUpdate("Update Persons set City = 'AZ' where PersonID = 1000");
	    System.out.println("Updated" + result + " Records Sucessfully in DB");*/
		
		//Delete
		int result = stmt.executeUpdate("DELETE from Persons where PersonID =9564");
	      System.out.println("Deleted" + result + " Records Sucessfully in DB");
		connection.close();
	}

}
