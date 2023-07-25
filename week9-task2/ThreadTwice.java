package task2;

public class ThreadTwice extends Thread{
	public void run() {
		System.out.println("thread run");
	}

	public static void main(String[] args) {
		ThreadTwice t=new ThreadTwice();
		t.start();
		t.start();
		

	}

}
