package task1;

public class ExceptionDoesnotOccur {

	public static void main(String[] args) {
		try {
			int data=25/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("final block is always executed");
		}
		System.out.println("rest of the code");

	}

}
