package Task3;
abstract class Bike{
	Bike()
	{
		System.out.println("Bike is created");
	}

abstract void run();
void changeGear() {
	System.out.println("Gear changed");
}
}
class Honda extends Bike{
	void run() {
		System.out.println("running");
	}
}

public class Abstr {

	public static void main(String[] args) {
		
Bike obj=new Honda();
obj.changeGear();
obj.run();
	}

}
