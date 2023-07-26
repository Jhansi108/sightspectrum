package task3;

public class RunCall extends Thread {
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
	}}
	
	

	public static void main(String[] args) {
		RunCall r1=new RunCall();
		RunCall r2=new RunCall();
		r1.run();
		r2.run();

	}

}
