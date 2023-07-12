package Task3;
class PetAnimal{
	void eat()
	{
		System.out.println("eating");
	}
}
class Puppy extends PetAnimal{
	void bark() {
		System.out.println("barking");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.bark();
		
	}

}
