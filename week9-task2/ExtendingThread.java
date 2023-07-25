package task2;

public class ExtendingThread extends Thread {
	public void run()
	{
		System.out.println("thread is running");
	}
	
		
		public static void main(String[] args) {
			ExtendingThread e=new ExtendingThread();
			e.start();
			

	}

}
