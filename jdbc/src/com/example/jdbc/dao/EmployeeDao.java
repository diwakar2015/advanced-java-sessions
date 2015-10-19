package com.example.jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.example.jdbc.model.Employee;
import com.example.jdbc.sql.EmployeeSQL;
import com.example.jdbc.util.ConnectionHelper;

import java.sql.PreparedStatement;

public class EmployeeDao {

	private Connection connection = ConnectionHelper.getConnection();
	
	public int saveEmployee(Employee newEmployee)
	{
		
		int nofOfRecordInserted = 0;
		
		try {
			PreparedStatement statement = connection.prepareStatement(EmployeeSQL.INSERT_EMPLOYEE);
			statement.setInt(1,newEmployee.getEmpId());
			statement.setString(2, newEmployee.getName());
			statement.setInt(3, newEmployee.getSalary());
			
			nofOfRecordInserted = statement.executeUpdate();
			
			
		} catch (SQLException e) {
			
			System.out.println("Exception while inserting the record in DB: "+ e.getMessage());
		}
		
		if(nofOfRecordInserted > 0)
		{
			System.out.println("Employee details saved successfully!!");
		}
		
		return nofOfRecordInserted;
		
	}
	
	public int saveEmployees(List<Employee> empList)
	{
	
		int nofOfRecordInserted = 0;
		
		
		for(Employee emp : empList)
		{
			try {
				PreparedStatement statement = connection.prepareStatement(EmployeeSQL.INSERT_EMPLOYEE);
				statement.setInt(1,emp.getEmpId());
				statement.setString(2, emp.getName());
				statement.setInt(3, emp.getSalary());
				
				int recordInserted = statement.executeUpdate();
				nofOfRecordInserted = nofOfRecordInserted + recordInserted ;
				
				
			} catch (SQLException e) {
				
				System.out.println("Exception while inserting the record in DB: "+ e.getMessage());
			}
			
			
		}
		
		System.out.println("No of record saved: "+ nofOfRecordInserted);
		return nofOfRecordInserted;
		
	}
	
	
	

}
