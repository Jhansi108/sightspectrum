package Task3;
class A{
	void msg()
	{
		System.out.println("Hi");
	}
}
class B extends A{
	void msg()
	{
		System.out.println("Welcome");
	}
}

public class Multiple extends A,B {

	public static void main(String[] args) {
		Multiple m=new Multiple();
		m.msg();
		

	}
}



