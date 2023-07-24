package task1;

public class OccurandHandled {

	public static void main(String[] args) {
		try {
			System.out.println("inside the block");
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
		finally {
			System.out.println("final block is executed ");
		}
		System.out.println("rest of the code");

	}

}
