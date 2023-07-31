package task1;
class Table{
	void printTable(int n)
	{
		synchronized(this)//synchronised block
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
	}//end of the synchronised block
}
	class Thread1 extends Thread{
		Table t;
		Thread1(Table t)
		{
			this.t=t;
		}
		public void run()
		{
			t.printTable(5);
		}
		class Thread2 extends Thread{
			Table t;
			Thread2(Table t)
			{
				this.t=t;
			}
			public void run()
			{
				t.printTable(100);
			}
		}
		
	}

public class SynBlock {

	public static void main(String[] args) {
		Table obj=new Table();
		Thread1 t3=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t3.start();
		t2.start();
		
		
	}
		
	}

}
