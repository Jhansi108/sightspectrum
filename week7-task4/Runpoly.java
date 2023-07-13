package Task4;
class Test{
	public void method()
	{
		System.out.println("Method 1");
	}
	
	}

public class Runpoly extends Test {
	public void method()
	{
		System.out.println("Method 2");
	}

	public static void main(String[] args) {
		Test t=new Runpoly();
		t.method();
		
	}

}
