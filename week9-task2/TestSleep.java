package task2;

public class TestSleep extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {Thread.sleep(500);
		}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
			}
	}

	public static void main(String[] args) {
		TestSleep s1=new TestSleep();
		TestSleep s2=new TestSleep();
		s1.start();
		s2.start();
		

	}

}
