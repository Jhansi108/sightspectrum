package task3;

public class RunM extends Thread {
	public void run()
	{
		System.out.println("thread run");
	}
	

	public static void main(String[] args) {
		RunM r=new RunM();
		r.run();

	}

}
