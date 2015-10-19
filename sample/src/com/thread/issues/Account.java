package com.thread.issues;

public class Account {

	//final static  Object LOCK = new Object();

	int balance = 5000000;

	public synchronized void  withdraw(int amount)
	{

		System.out.println("Hello Threasd");
	
			int diff  =  balance - amount;

			if(diff >= 0)
			{

				balance = balance - amount;

				System.out.println("Withdrew amount : "+ amount + " by AccountHolder "+ Thread.currentThread().getName());
				System.out.println("Balance is : "+ balance);

				if(balance<0)
				{
					System.out.println("Balance has become negative, which is not expected");
					System.out.println("Existing now..");
					System.exit(0);
				}

			

		}

	}



}

class WithDrawer extends Thread
{
	Account acc;

	public WithDrawer(Account acc)
	{
		this.acc = acc;
	}

	@Override
	public void run()
	{
		System.out.println("Going to withdraw an amount of 100");
		acc.withdraw(10);

	}



}