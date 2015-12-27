package com.assignment.example;

public class ThreadAlive {

	public ThreadAlive() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLive ex =new ThreadLive();
		ex.start();
		
		
	}

}
class ThreadLive extends Thread 
{
	ThreadLive()
	{
		new Thread().start();
		System.out.println("My Thread Run is over" );
		
	}
	@Override
	public void run()
	{
		int i =1;
		while(i<10)
		{
			
			Thread t = Thread.currentThread();
			String str ="";
			 if(t.isAlive())
			 {
				 str="alive";
			 }
			 else
			 {
				 str="over";
			 }
					 
			// tests if this thread is alive
			System.out.println(i);
			System.out.println("Main thread will be alive till the child thread is "+str );
			i++;
		}	   
		
	}
	
}