package com.example.thread;

public class ABC {
	
	public static void main(String[] args) {
		
		System.out.println("Thread name : "+ Thread.currentThread().getName());
		
		System.out.println("Prining hello after a second");
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("Hello");
		
	}

}
