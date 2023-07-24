package task1;

public class CodeTrynotEX {

	public static void main(String[] args) {
		try {
			int d=50/0;
			System.out.println("rest of the code");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
