package com.example.jdbc.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.example.jdbc.dao.EmployeeDao;
import com.example.jdbc.model.Employee;

public class MainApp {
	
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		for(int i=0; i<10; i++)
		{
			Employee emp = new Employee();
			
			emp.setEmpId(10+i);
			emp.setName("Emp-"+i);
			emp.setSalary(1000+i);
			
			empList.add(emp);
		}
		
		EmployeeDao dao = new EmployeeDao();
		dao.saveEmployees(empList);
		System.out.println("DONE!!");
		
		
		
		
/*	Employee emp = new Employee();
	
	emp.setEmpId(1);
	emp.setName("Madhuri");
	emp.setSalary(10000);
	
	EmployeeDao dao = new EmployeeDao();
	
	dao.saveEmployee(emp);
	
	System.out.println("Done!!");*/
		
		
	}
	

}
