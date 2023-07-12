package Task3;
abstract class WaterAnimal{
	abstract void makeSound();
	public void eat() {
		System.out.println("Eating");
	}
}
class Fish extends WaterAnimal{
	public void makeSound()
	{
		System.out.println("bubbles");
	}
}



public class Abs {

	public static void main(String[] args) {
		Fish f=new Fish();
		f.eat();
		f.makeSound();

	}

}
