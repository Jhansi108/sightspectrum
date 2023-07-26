package task3;

public class Program extends Thread{
	public void run()
	{
		System.out.println("thread is run");
	}

	public static void main(StringPro[] args) {
		Program ths=new Program();
		ths.start();
		

	}

}
