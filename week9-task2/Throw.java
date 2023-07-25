package task2;

public class Throw {
	public static void checkNum(int num) {
		if(num<1)
		{
			throw new ArithmeticException("\n Number is negative cannot calculate square");
		}
		else
			System.out.println("square of " + num + (num*num));
	}

	public static void main(String[] args) {
		Throw th=new Throw();
		th.checkNum(4);
		System.out.println("rest of the code");
		

	}

}
