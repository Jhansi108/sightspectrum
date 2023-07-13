package Task4;
class Parent{
	void print()
	{
		System.out.println("parents");
	}
}
class Subclass extends Parent{
	void print()
	{
		System.out.println("children");
	}
}
class Subclass1 extends Parent{
	void print()
	{
		System.out.println("child");
	}
}

public class Runpolymor {

	public static void main(String[] args) {
		Parent a;
		a=new Subclass();
		a.print();
		a=new Subclass1();
		a.print();
		

	}

}
