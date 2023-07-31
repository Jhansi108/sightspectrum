package task1;
class Key{
	synchronized static void printKey(int n)
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				
			}
		}
		
	}
	
}
class Thread4 extends Thread{
	public void run()
	{
		Key.printKey(10);
	}
}
class Thread5 extends Thread{
	public void run()
	{
		Key.printKey(100);
	}
}
class Thread6 extends Thread{
	public void run()
	{
		Key.printKey(1000);
	}
}

public class StaticSyn {

	public static void main(String[] args) {
		Thread4 t4=new Thread4();
		Thread5 t5=new Thread5();
		Thread t6=new Thread6();
		t4.start();
		t5.start();
		t6.start();
		

	}

}
