package Task4;
class Pet{
	void eat()
	{
		System.out.println("eating");
	}
}
class Cat extends Pet{
	void eat()
	{
		System.out.println("meat");
	}
}
class Babycat extends Cat{
	void eat()
	{
		System.out.println("milk");
	}
}

public class RuntimePoly {

	public static void main(String[] args) {
		Pet a1,a2,a3;
		a1=new Pet();
		a2=new Cat();
		a3=new Babycat();
		a1.eat();
		a2.eat();
		a3.eat();
		

	}

}
