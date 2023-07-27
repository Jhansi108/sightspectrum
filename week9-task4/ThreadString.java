package task4;

public class ThreadString {

	public static void main(String[] args) {
		Thread t=new Thread("my thread");
		t.start();
		String s=t.getName();
		System.out.println(s);

	}

}
