package com.andro;

import java.sql.Connection;

import dbconn.ConnectionProvider;

public class RegisterUser 
{
	public static void main(String[] args) 
	{	
	Connection connection=ConnectionProvider.getConnection();
	System.out.println(connection);
	
		
	}

}
