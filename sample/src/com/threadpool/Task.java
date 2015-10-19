package com.threadpool;

public class Task implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Printing the all even numbers from 1 to 10 by Thread : "+ Thread.currentThread().getName());
		
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number : "+ i + " printed by : "+ Thread.currentThread().getName());
			}
		}
		
	}
	
	

}
