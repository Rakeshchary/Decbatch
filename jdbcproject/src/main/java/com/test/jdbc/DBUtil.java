package com.test.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {
	
	
	private static Properties dbProperties= new Properties();
	static{
		
            try{
			
			//FileInputStream fileInStream = new FileInputStream("C:\Users\suroj\workspace\jdbcproject\src\main\java\com\test\jdbc\databaseproperties");
	          dbProperties.load(DBUtil.class.getResourceAsStream("databaseproperties"));
	          System.out.println("Db Properties :"+ dbProperties);
		
              }catch(Exception ex){
    	       ex.printStackTrace();
    	
              }
	          }

	public static Connection getDBConnection(){
	
		//Load configuration
		  try{
			
			//FileInputStream fileInStream = new FileInputStream("C:\\Users\\suroj\\workspace\\jdbcproject\\src\\main\\java\\databaseproperties");
			//dbProperties.load(fileInStream);
			
			//Load Driver Class Name
			Class.forName(dbProperties.getProperty("dbClassName"));
			
			//Get the connection
			Connection connection = DriverManager.getConnection(dbProperties.getProperty("Url"),dbProperties.getProperty("Username"),dbProperties.getProperty("Password"));
		
			return connection;
		
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Failed to create DBConnection");
		}
		
		return null;

}
}
