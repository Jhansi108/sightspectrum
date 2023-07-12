package Task3;
class Parentclass1{
	void text()
	{
		System.out.println("Inside parentclass1");
	}
}
class Parentclass2{
	void text()
	{
		System.out.println("Inside parentclass2");
	}
}

public class MulInher extends Parentclass1,Parentclass2 {

	public static void main(String[] args) {
		Multiple m=new Multiple();
		m.text();
	

	}

}
