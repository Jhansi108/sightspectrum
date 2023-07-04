package task2;
class Gayathri{
	void eat()
	{
		System.out.println("eating");
	}
}
	class Dog extends Gayathri{
		void bark()
		{
			System.out.println("barking");
		}
	}


public class SingleInheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();
		
		
		

	}

}
