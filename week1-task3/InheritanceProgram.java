package task4;
class a
{
	public void run()
	{
		System.out.println("jhansi");
	}
}
class b extends  a
{
	public void print()
	{
		System.out.println("markapur");
	}
}

public class InheritanceProgram {

	public static void main(String[] args) {
		b bb=new b();
		bb.print();
		bb.run();
				

	}

}
