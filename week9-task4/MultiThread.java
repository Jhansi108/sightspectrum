package task4;

public class MultiThread extends Thread {
	public void run()
	{
		System.out.println("thread run");
	}

	public static void main(String[] args) {
		MultiThread m=new MultiThread();
		m.start();
		

	}

}
