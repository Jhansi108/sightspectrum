package Task3;
class F{
	public void disp()
	{
		System.out.println("apple");
	}
}
class K extends F{
	public void disp()
	{
		System.out.println("bat");
	}
}
class L extends F{
	public void disp()
	{
		System.out.println("cat");
	}
}

public class Hybrid extends K {
	public void disp()
	{
		System.out.println("dog");
	}

	public static void main(String[] args) {
		Hybrid h=new Hybrid();
		h.disp();
		

	}

}
