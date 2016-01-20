package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBRead {

	public static void main(String[] args)throws Exception{
		
		  //printStudentDetails1("MBA");
		//printStudentDetails("101");
		
		System.out.println("====================");
		    //printStudentDetails("999999 OR 1=1");
		      //printStudentDetails1("MBBS OR 1=1");//SQL Injection

		//insertDBRecord();
		  insertDBRecordStmt();
	}
	
	public static void printStudentDetails(String sno) throws Exception{
		
		Connection connection = DBUtil.getDBConnection();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("Select* from Student where sno = " +sno); 
		while(rs.next()){
			System.out.println("sno " +rs.getInt("sno"));
			System.out.println("sname " +rs.getString("sname"));
			System.out.println("Course " +rs.getString("Course"));
			System.out.println("fee " +rs.getInt("fee"));
		
		}
	}
	
		public static void printStudentDetails1(String course) throws Exception{
			
			Connection connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("Select course,fee from Student where course = ?");
			pstmt.setString(1,course);
			ResultSet rs = pstmt.executeQuery(); 
			while(rs.next()){
				//System.out.println("sno " +rs.getInt("sno"));
				//System.out.println("sname " +rs.getString("sname"));
				System.out.println("Course " +rs.getString("Course"));
				System.out.println("fee " +rs.getInt("fee"));
		

}
		}
				
			public static void insertDBRecord()throws Exception{
				Connection connection = DBUtil.getDBConnection();
				PreparedStatement pstmt = connection.prepareStatement("Insert INTO Persons VALUES(?,?,?,?,?)");
				for(int i=9000;i<10000;i++){
			     pstmt.setInt(1,i);
			     pstmt.setString(2,"Fname"+i);
			     pstmt.setString(3,"lname"+i);
			     pstmt.setString(4,"Address"+i);
			     pstmt.setString(5,"City"+i);
			     pstmt.executeUpdate();
				
				}
			}	
			
			public static void insertDBRecordStmt()throws Exception{
				Connection connection = DBUtil.getDBConnection();
				//PreparedStatement pstmt = connection.prepareStatement("Insert INTO Persons VALUES(?,?,?,?,?)");
				Statement stmt = connection.createStatement();
				    for(int i=10000;i<12000;i++){
					stmt.executeUpdate("Insert INTO Persons VALUES(" + i +",'"+"Fname"+i+"',"
							+",'"+"lname"+i+"',"
							+",'"+"Address"+i+"',"
							+",'"+"City"+i+"')");
				
				}   
}
}

