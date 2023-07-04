package task2;
class Animal{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("barking");
	}
}
class BabyDog extends Dog{
	void run()
	{
		System.out.println("running");
	}
}


public class MultiLevel {

	public static void main(String[] args) {
		BabyDog d=new BabyDog();
		d.bark();
		d.eat();
		d.run();

	}

}
