package com.assignment.example;

public class Threading {

	public Threading() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ThreadExp exp =new ThreadExp();
			
			Thread t1 =new Thread(exp);
			t1.setPriority(Thread.MAX_PRIORITY);
			t1.setName("Thread Priority High:");
			
			Thread t2 =new Thread(exp);
			t2.setName("Thread Priority Medium:");
			t2.setPriority(Thread.NORM_PRIORITY);
			
			
			Thread t3 =new Thread(exp);
			t3.setName("Thread Priority Low:");
			t3.setPriority(Thread.MIN_PRIORITY);
			
			t1.start();
			t2.start();
			t3.start();
			System.out.println("All Threads Started");
		}
		catch(Exception ex)
		{
		}
		
	}
}
