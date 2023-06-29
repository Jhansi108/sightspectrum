package task4;
abstract class add{
	abstract void print();
	{
		System.out.println("laptop");
	}
}

public class Abstraction extends add {
	public void print()
	{
		System.out.println("program");
	}

	public static void main(String[] args) {
		add a=new Abstraction();
		a.print();
	}

}
