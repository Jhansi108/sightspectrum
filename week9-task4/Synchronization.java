package task4;
class table{
	 synchronized void Printtable(int n)
	 {
		 for(int i=0;i<=5;i++)
		 {
			 System.out.println(n*i);
			 try {
				 Thread.sleep(400);
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		 }
	 }
}

public class Synchronization {

	public static void main(String[] args) {
		final table obj=new table();
		Thread t1=new Thread()
				{
		public void run()
		{
			obj.Printtable(5);
		}
				};
		Thread t2=new Thread()
				{
			public void run()
			{
				obj.Printtable(100);
			}
				};
				t1.start();
				t2.start();
		
		
		
				

	}

}
