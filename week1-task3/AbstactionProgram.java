package task4;
abstract class add{
	abstract void print();
	{
		System.out.println("jhansi");
	}
}
public class AbstactionProgram extends add {
	public void print()
	{
		System.out.println("girl");
	}
	public static void main(String[] args) {
		add a=new AbstactionProgram();
		a.print();
}
}

	


