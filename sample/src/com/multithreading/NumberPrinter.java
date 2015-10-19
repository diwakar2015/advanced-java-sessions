package com.multithreading;

public class NumberPrinter extends Thread{
	
	@Override
	public void run()
	{
		
		System.out.println("I am thread : "+ Thread.currentThread().getName() + " calling runPrinterMethod() method to print all even numbers");
		this.runPrinterMethod();
	}
	
	public void runPrinterMethod()
	{
		
		for(int i =1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number : "+i + " by thread "+Thread.currentThread().getName()  );
			}
			
		}
		
		
	}
	

}
