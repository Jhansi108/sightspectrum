package task4;
class a
{
	public void run()
	{
		System.out.println("system");
	
		
	}
}
class b extends a
{
	public void print()
	{
		System.out.println("dell");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		b bb=new b();
		bb.print();
		bb.run();
	}

}
