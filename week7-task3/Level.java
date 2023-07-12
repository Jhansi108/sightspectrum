package Task3;
class four{
	void num()
	{
		System.out.println("Screen");
	}
}
class five extends four{
	void numb()
	{
		System.out.println("Display");
	}
}
class three extends five{
	void number()
	{
		System.out.println("Desktop");
	}
	
}

public class Level {

	public static void main(String[] args) {
		three t=new three();
		t.num();
		t.numb();
		t.number();

	}

}
