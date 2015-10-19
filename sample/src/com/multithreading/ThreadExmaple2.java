package com.multithreading;

public class ThreadExmaple2 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("printting 1 to 10");
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("Value : "+ i + " printed by "+ Thread.currentThread().getName());
		}
		
		
	}
	
	

}
