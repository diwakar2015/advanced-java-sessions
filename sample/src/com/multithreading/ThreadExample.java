package com.multithreading;

public class ThreadExample {
	
	
	public static void main(String[] args) {
		
		NumberPrinter t1 = new NumberPrinter();  // new state (t1)
		t1.setName("Thread-1");
		
		
		
		NumberPrinter t2 = new NumberPrinter();  // new state (t1)
		t2.setName("Thread-2");
		
		NumberPrinter t3 = new NumberPrinter();  // new state (t1)
		t3.setName("Thread-3");
		t3.setPriority(Thread.MAX_PRIORITY);
		
		NumberPrinter t4 = new NumberPrinter();  // new state (t1)
		t4.setName("Thread-4");
		
	
		t1.start();
		t2.start();
		t3.start();
		
		t4.start();
		
		// moves to runnable state and allocated to TS
			
		
	}

}
