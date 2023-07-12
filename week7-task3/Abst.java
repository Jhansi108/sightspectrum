package Task3;
abstract class Laptop{
	abstract void keys();
}

public class Abst extends Laptop {
	public void keys()
	{
		System.out.println("Using");
	}

	public static void main(String[] args) {
		Laptop l=new Abst();
		l.keys();

	}

}
