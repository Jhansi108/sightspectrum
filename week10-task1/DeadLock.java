package task1;

public class DeadLock {

	public static void main(String[] args) {
		final String program1="Java Program";
		final String program2="Python Program";
		Thread t1=new Thread()
				{
			public void run()
			{
				synchronized(program1)
				{
					System.out.println("Thread1:locked program1");
					try {
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						
					}
					synchronized(program2)
					{
						System.out.println("Thread1:locked program2");
					}
				}
			}
				};
		Thread t2=new Thread()
				{
			public void run()
			{
				synchronized(program2)
				{
					System.out.println("Thread2:locked program2");
					try {
						Thread.sleep(100);
					}
					catch (Exception e)
					{
						
					}
				}
			}
				};
		synchronized(program1)
		{
			System.out.println("Thread2:locked program1");
		}
		t1.start();
		t2.start();

	}

}

