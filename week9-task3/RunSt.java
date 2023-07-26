package task3;

public class RunSt implements Runnable{
	public void run()
	{
		System.out.println("thread run");
	}

	public static void main(String[] args) {
		Runnable r=new RunSt();
		Thread t=new Thread(r,"my thread");
		t.start();
		String Str=t.getName();
		System.out.println(Str);
		
		
}}
