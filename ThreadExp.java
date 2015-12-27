package com.assignment.example;

public class ThreadExp implements Runnable {

	public ThreadExp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Name : "+Thread.currentThread().getName());
			for(int i =0; i<=5;i++)
			{
				Thread.sleep(100);
				System.out.println("Times : "+i+" >>>>"+Thread.currentThread().getName());
				
				
			}
			
		}
		catch(Exception ex)
		{
			
		}
	}

}
