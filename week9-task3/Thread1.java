package task3;
public class Thread1 implements Runnable
{
	@SuppressWarnings("deprecation")

static Thread t1;	
public void run()
{
 System.out.println("Thread is running");
 int i = 0;
while(i < 10)
{
 System.out.println("i: " +i);
 if(i == 5)	
	 t1.stop();
  i = i + 1;
  }
}
public static void main(String[] args) 
{
 Thread1 th1 = new Thread1();
 Thread t1 = new Thread(th1);
  t1.start();
  t1.start(); 
  // Calling the start() method again to alive a dead thread.
 }
}
