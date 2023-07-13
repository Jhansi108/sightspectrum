package Task4;
class Animal{
	public void animalSound()
	{
	System.out.println("the animal make sound");
	}
}
class dog extends Animal{
	public void animalSound()
	{
		System.out.println("bow bow");
	}
}
class pig extends Animal{
	public void animalsound()
	{
		System.out.println("wee wee");
	}
}
	

public class Polymorphism {

	public static void main(String[] args) {
		Animal a=new Animal();
		Animal p=new pig();
		Animal d=new dog();
		a.animalSound();
		p.animalSound();
		d.animalSound();
		

	}

}
