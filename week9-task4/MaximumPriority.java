package task4;

public class MaximumPriority extends Thread {
	public void run()
	{
		System.out.println("thread priority is: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		MaximumPriority m=new MaximumPriority();
		m.setPriority(MAX_PRIORITY);
		m.start();
		

	}

}
