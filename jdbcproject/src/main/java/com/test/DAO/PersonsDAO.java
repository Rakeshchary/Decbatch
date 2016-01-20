package com.test.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.test.jdbc.DBUtil;

public class PersonsDAO {
	
	public void insert(int PID,String Fname,String lname,String Address,String City)throws Exception{
		Connection connection = DBUtil.getDBConnection();
		PreparedStatement pstmt = connection.prepareStatement("Insert INTO Persons VALUES(?,?,?,?,?)");
	     pstmt.setInt(1, PID);
	     pstmt.setString(2, Fname);
	     pstmt.setString(3, lname);
	     pstmt.setString(4, Address);
	     pstmt.setString(5, City);
	     pstmt.executeUpdate();
	     
	     connection.close();
		}
	
	public void insert(PersonDTO person)throws Exception{
		Connection connection = DBUtil.getDBConnection();
		PreparedStatement pstmt = connection.prepareStatement("Insert INTO Persons VALUES(?,?,?,?,?)");
	     pstmt.setInt(1, person.getPid());
	     pstmt.setString(2, person.getFname());
	     pstmt.setString(3, person.getLname());
	     pstmt.setString(4, person.getAddress());
	     pstmt.setString(5, person.getCity());
	     pstmt.executeUpdate();
	     
	     connection.close();
	
}
}
