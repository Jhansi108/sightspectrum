package task2;

public class Finally {

	public static void main(String[] args) {
		try {
			System.out.println("inside the try block");
			int data=25/0;
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
			System.out.println(e);
		}
		finally {
			System.out.println("finally is executed");
		}
		System.out.println("rest of the code");

	}

}
