package multithreading;
 
import java.util.Scanner;
public class NumberSequenceThread {
	
private int n;
private int number=1;
private final Object lock=new Object();
	
public NumberSequenceThread(int n)
	{
		this.n=n;
		
		Runnable task=()->{
			while(true)
			{
				synchronized(lock)
				{
					if(number >n)
					{
						lock.notifyAll();
						break;
}
					System.out.println(number + " ");
					number++;
					lock.notifyAll();
					try
					{
						lock.wait();
					}
						catch(InterruptedException e)
					{
						Thread.currentThread().interrupt();
					}
					}
					}
};
Thread t1=new Thread(task);
Thread t2=new Thread(task);
Thread t3=new Thread(task);
 
t1.start();
t2.start();
t3.start();
 
try
{
	t1.join();
	t2.join();
	t3.join();
}
catch(InterruptedException e)
{
	Thread.currentThread().interrupt();
}
}
 
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
new NumberSequenceThread(n);
sc.close();
}
}