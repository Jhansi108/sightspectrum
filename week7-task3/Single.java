package Task3;
class one{
	void Program ()
	{
		System.out.println("true");
	}
}
class two extends one{
	void Laptop()
	{
		System.out.println("false");
	}
}

public class Single {

	public static void main(String[] args) {
		two t=new two();
		t.Program();
		t.Laptop();
		
	}

}
