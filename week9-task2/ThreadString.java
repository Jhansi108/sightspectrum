package task2;

public class ThreadString {

	public static void main(String[] args) {
		Thread t=new Thread("my thread");
		t.start();
		String str=t.getName();
		System.out.println(str);
		

	}

}
