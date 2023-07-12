package Task3;
class Birds{
	void fly()
	{
		System.out.println("Flying");
	}
}
class Peacock extends Birds{
	void dance()
	{
		System.out.println("Dancing");
	}
}
class Dove extends Birds{
	void walk()
	{
		System.out.println("Walking");
	}
	
	
}

public class Hi {

	public static void main(String[] args) {
		Dove d=new Dove();
		d.fly();
		d.walk();
		
		

	}

}
