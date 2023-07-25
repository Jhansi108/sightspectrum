package task2;

public class ImplementingRunnaInterface implements Runnable {
	public void run()
	{
		System.out.println("thread is run");
	}

	public static void main(String[] args) {
		ImplementingRunnaInterface m=new ImplementingRunnaInterface();
		Thread t=new Thread(m);
		t.start();
		
		

	}

}
