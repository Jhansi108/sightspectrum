package Task3;
abstract class Animal{
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	public abstract void makeSound();
	public String getname() {
		return name;
	}
}
class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	public void makeSound(){
		System.out.println(getname() + " barks");
	}
}
class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	public void makeSound() {
		System.out.println(getname() + " meow");
	}
}

public class Abstraction {
	

	public static void main(String[] args) {
		Animal myDog=new Dog("rocky");
		Animal myCat=new Cat("Simba");
		myDog.makeSound();
		
		
		

	}

}
