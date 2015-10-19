package com.example.thread;

import java.util.ArrayList;

public class NameStoreThread extends Thread{
	
	public static final ArrayList<String> nameList = new ArrayList<String>();
	String name;
	
	@Override
	public void run()
	{
		
	  	addNewName(name);
		
	}
	
	public void addNewName(String name)
	{
		
		System.out.println("Adding the name : "+ name + " thread : "+ Thread.currentThread().getName());
		nameList.add(name);
		System.out.println("Name added to the list by thread "+ Thread.currentThread().getName());
		
	}
	
	
}
