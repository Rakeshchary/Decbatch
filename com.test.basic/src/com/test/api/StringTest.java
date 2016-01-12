package com.test.api;

import basic.oops.Employee;

public class StringTest {

	public static void main(String s[]) {
		String input = "201,Abhi,1256";
		String[]data = input.split(" , ");
		Employee emp = new Employee(Integer.parseInt(data[0]),data[1],Float.parseFloat(data[2]));
		System.out.println(emp);
	}

}
