package task4;
abstract class Pen{
	abstract void  pencil();
}

public class Abstraction  extends Pen{
	public void pencil()
	{
		System.out.println("writing");
	}

	public static void main(String[] args) {
		Pen obj=new Abstraction();
		obj.pencil();
		

	}

}
