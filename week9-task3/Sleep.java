package task3;

public class Sleep extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Sleep s1=new Sleep();
		Sleep s2=new Sleep();
		s1.start();
		s2.start();
		
		

	}

}
