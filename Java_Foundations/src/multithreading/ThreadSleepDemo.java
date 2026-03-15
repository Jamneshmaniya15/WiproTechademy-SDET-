package multithreading;
 
public class ThreadSleepDemo extends Thread {
public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args)
{
	 ThreadSleepDemo t1=new  ThreadSleepDemo();
	 ThreadSleepDemo t2=new  ThreadSleepDemo();
	
	 t1.setName("Thread-1");
	 t2.setName("Thread-2");
	 t1.start();
	 t2.start();
 
}
 
}