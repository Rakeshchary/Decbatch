package com.test.api;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;

public class ReadFileApp {
	public static void main(String[] args)throws Exception{
		
		/*FileInputStream fileinputstream = new FileInputStream("C:\\Users\\suroj\\workspace\\com.test.basic\\sample.txt");
		int data;
		while( (data=fileinputstream.read())!= -1){
			System.out.print((char)data);
		}
		fileinputstream.close();*/
		String filedata = FileUtils.readFileToString(new File("C:\\Users\\suroj\\workspace\\com.test.basic\\sample.txt"));
			System.out.println(filedata);	
	}
	
	

}
