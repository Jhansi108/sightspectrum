package task3;

public class ThreadS extends Thread {
	public void run()
	{
		System.out.println("thread run");
	}

	public static void main(String[] args) {
		ThreadS ts=new ThreadS();
		ts.start();
		
		

	}

}
