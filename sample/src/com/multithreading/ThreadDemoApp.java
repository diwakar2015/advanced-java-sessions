package com.multithreading;

public class ThreadDemoApp {
	
	public static void main(String[] args) {
		
		ThreadExmaple2 t1 = new ThreadExmaple2();
		
		Thread thread1 = new Thread(t1);
		
		thread1.setName("Thread-1");
		
		thread1.start();
		
ThreadExmaple2 t2 = new ThreadExmaple2();
		
		Thread thread2 = new Thread(t1);
		
		thread2.setName("Thread-2");
		
		thread2.start();
		
		
		
		
		
	}

}
