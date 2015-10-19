package com.example.jdbc.util;

import java.sql.Connection;

import com.example.jdbc.common.ConnectionFactory;

public class ConnectionHelper {
	
	public static Connection getConnection()
	{
		ConnectionFactory factory = ConnectionFactory.getInstance();
		return factory.getConnection();
		
	}

}
