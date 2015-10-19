package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerManagerPool {
	
	
	
	
	
	
	public static void main(String[] args) {
		ExecutorService executors = Executors.newFixedThreadPool(100);
				
		for(int i=0; i<5000; i++)
		{
			
			Runnable task = new Task();
			executors.submit(task);
			
		}
		
		
		executors.shutdown();
		while(executors.isTerminated())
		{
			System.out.println("ALl work is done...");
		}
		
		
	}

}
