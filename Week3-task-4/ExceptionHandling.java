package task4;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int a=5;
			int b=3;
			int c=a+b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("im excuted");
		}
	}

}
