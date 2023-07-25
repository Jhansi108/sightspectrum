package task2;

public class Threadclass implements Runnable {
	public void run()
	{
		System.out.println("thread run");
	}

	public static void main(String[] args) {
		Runnable r=new Threadclass();
		Thread t=new Thread("my thread");
		t.start();
		String str=t.getName();
		System.out.println(str);
			
		
	}

}
