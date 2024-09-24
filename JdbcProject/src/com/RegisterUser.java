package com;

import java.sql.Connection;

import database.ConnectionProvider;

public class RegisterUser {
	
	
	public static void main(String[] args) {
		
		Connection myConnection = ConnectionProvider.getMyConnection();
		System.out.println("RegisterUser ==>>>>>>>>>>"+myConnection);
		
		
		
		
	}

}
