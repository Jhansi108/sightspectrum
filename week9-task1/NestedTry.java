package task1;

public class NestedTry {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("going to divided by 0");
				int b=39/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try {
				int a[]=new int[5];
				a[5]=4;
				
			}
			catch(ArrayOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("other statement");
		}
		catch(Exception e)
		{
			System.out.println("handled the exception (outer catch)");
		}
		System.out.println("normal flow");
	}

}
