package task4;

public class Normal extends Thread {
	public void run()
	{
		System.out.println("Priority of the thread is: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Normal n=new Normal();
		n.setPriority(NORM_PRIORITY);
		n.start();
		

	}

}
