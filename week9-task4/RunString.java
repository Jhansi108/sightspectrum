package task4;

public class RunString implements Runnable {
	public void run()
	{
		System.out.println("now thread is running");
	}

	public static void main(String[] args) {
		Runnable r1=new RunString();
		Thread th=new Thread(r1,"my thread");
		th.start();
		String s=th.getName();
		System.out.println(s);
		

	}

}
