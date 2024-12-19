package Thread;

public class ThreadName_Run 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Thread is - " + Thread.currentThread().getName());
		Thread t1 = new Thread(new ThreadName_Run().new ThreadImpl());
		t1.start();
	}

	class ThreadImpl implements Runnable
	{
		public void run()
		{
			System.out.println(Thread.currentThread().getName() + ", executing run() method!");
		}
	}
}
