package Task3;
class Nature{
	void environ()
	{
		System.out.println("environment");
	}
}
class Birds extends Nature{
	void flies()
	{
		System.out.println("flying");
	}
	
	
}
class Insects extends Nature{
	void eats()
	{
		System.out.println("eating");
	}
}

public class Hierarichal {

	public static void main(String[] args) {
		Insects i=new Insects();
		i.eats();
		i.environ();
		
	}

}
