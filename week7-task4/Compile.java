package Task4;

public class Compile {
	void show(int num1)
	{
		System.out.println("number: " + num1);
	}
	void show (int num1,int num2)
	{
		System.out.println("number1: " + num1 + " number2: " + num2);
	}

	public static void main(String[] args) {
		Compile c=new Compile();
		c.show(5);
		c.show(6, 8);

	}

}
