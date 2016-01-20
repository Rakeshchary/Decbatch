package com.test.DAO;

public class DAOApp {

	public static void main(String[] args)throws Exception{
		//Read person Input
		PersonsDAO dao = new PersonsDAO();
		dao.insert(new PersonDTO(1000,"Laddu","SB","CA","MP"));
	}

}
