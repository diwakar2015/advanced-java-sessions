package com.thread.issues;

public class AccountExample {
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		for(int i=1; i<=50; i++)
		{
			
			
			WithDrawer t = new WithDrawer(acc);
			t.setName("AC-Holder-Thread-"+i);
			t.start();
		
	
		}
	
		
	}

}
