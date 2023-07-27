package task4;

public class Minimum extends Thread{
	public void run()
	{
		System.out.println("Priority of the thread is: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Minimum m=new Minimum();
		m.setPriority(MIN_PRIORITY);
		m.start();
		

	}

}
