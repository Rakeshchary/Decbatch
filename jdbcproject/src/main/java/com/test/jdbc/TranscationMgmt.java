package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TranscationMgmt {

	public static void main(String[] args) throws Exception{
		
		//Get Connection
		
		Connection connection = DBUtil.getDBConnection();
		connection.setAutoCommit(false);
	
		try{
		
		//Step1
		PreparedStatement pstmt = connection.prepareStatement("Insert INTO Persons VALUES(?,?,?,?,?)");
	     pstmt.setInt(1, 9999);
	     pstmt.setString(2, "jhon");
	     pstmt.setString(3, "W");
	     pstmt.setString(4, "MN");
	     pstmt.setString(5, "Plymouth");
	     pstmt.executeUpdate();
	     
	     //Step2(Fail)
	     pstmt = connection.prepareStatement("Insert INTO Test VALUES(?,?,?,?,?)");
	     pstmt.setInt(1, 9999);
	     pstmt.setString(2, "jhon");
	     pstmt.setString(3, "W");
	     
	     
	     connection.commit();
	     
		}catch(SQLException se){
			se.printStackTrace();
			connection.rollback();
		}
		  connection.close();
		
		}
	    	

}
