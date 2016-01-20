package com.test.DAO;

public class PersonDTO {
	
	private int pid;
	private String fname;
	private String lname;
	private String Address;
	private String City;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public PersonDTO(int pid, String fname, String lname, String address, String city) {
		super();
		this.pid = pid;
		this.fname = fname;
		this.lname = lname;
		Address = address;
		City = city;
	}
	public PersonDTO() {
		super();
		
	}
	
	
	
	

}
