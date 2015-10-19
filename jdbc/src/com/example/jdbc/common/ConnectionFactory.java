package com.example.jdbc.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static ConnectionFactory  _instance;
	private static Connection _connection;

	private ConnectionFactory() {}

	public static  ConnectionFactory getInstance()
	{
		if(_instance == null)
		{
			_instance =  new ConnectionFactory();
			
			try
			{
				Class.forName(ConnectionProperties.DRIVER_NAME);
				_connection = DriverManager.getConnection(ConnectionProperties.HOST_URL, 
						ConnectionProperties.USERNAME,ConnectionProperties.PASSWORD);
				if(_connection!=null)
				{
					System.out.println("Connection Object is retrieved successfully!!");

				}

			}
			catch(Exception e)
			{

				System.out.println("Exception occured while getting connection to MySQL : "+ e.getMessage());
			}

		}

		return _instance;

	}

	public  Connection getConnection()
	{
		return _connection;

	}
}