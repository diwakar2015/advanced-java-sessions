package com.example.thread;


public class ThreadExamples {

	public static void main(String[] args) {


		System.out.println(Thread.currentThread().getName());


		NameStoreThread t0 = new NameStoreThread();
		NameStoreThread t1 = new NameStoreThread();
		NameStoreThread t2 = new NameStoreThread();	
		NameStoreThread t3 = new NameStoreThread();	

		t0.name = "Peter";
		t1.name = "John";
		t2.name = "Sam";
		t3.name = "Bob";

		t0.start();
		t1.start();
		t2.start();
		t3.start();

		try
		{

			t0.join();
			t1.join();
			t2.join();
			t3.join();
		
		}
		catch(Exception e)
		{

		}

		System.out.println("All names has been added to prinintg the name list now..");

		
		

		System.out.println("Size of arraylist is : "+ NameStoreThread.nameList);


		for(String s : NameStoreThread.nameList)
		{
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			
			
			System.out.println("Name is : "+ s);
		}




	}

}
