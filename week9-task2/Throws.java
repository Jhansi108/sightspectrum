package task2;

public class Throws {
	public static int divideNum(int m,int n)throws ArithmeticException{
		int div=m/n;
		return div;
	}

	public static void main(String[] args) {
		Throws t=new Throws();
		try {
		System.out.println(t.divideNum(49, 7));
		}
		catch(ArithmeticException e)
		{
			System.out.println("\n Number cannot divided by zero");
		}
		System.out.println("rest of the code");

		}

}
