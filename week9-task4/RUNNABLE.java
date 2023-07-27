package task4;

public class RUNNABLE implements Runnable {
	public void run()
	{
		System.out.println("thread run");
	}

	public static void main(String[] args) {
		RUNNABLE r=new RUNNABLE();
		Thread t=new Thread(r);
		t.start();
				
		

	}

}
