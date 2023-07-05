package task3;

public class Compile {
	void show(int num1)
	{
		System.out.println("number:"+num1);
	}
	void show(int num1,int num2)
	{
		System.out.println("number:"+num1+" number:"+num2);
	}

	public static void main(String[] args) {
	Compile c=new Compile();
	c.show(2);
	c.show(3, 4);
	

	}

}
