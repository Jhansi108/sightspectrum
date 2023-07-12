package Task3;
class Bird{
	void eat()
	{
		System.out.println("eating");
	}
}
class Parrot extends Bird {
	void sound()
	{
		System.out.println("screech");
	}
}
class BabyParrot extends Parrot{
	void voice()
	{
		System.out.println("A coo");
	}
	
}

public class Multi {

	public static void main(String[] args) {
		BabyParrot p=new BabyParrot();
		p.eat();
		p.sound();
		p.voice();
		

	}

}
