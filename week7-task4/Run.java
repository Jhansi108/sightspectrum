package Task4;
class Bike {
	void run() {
		System.out.println("running");
	}
}

public class Run extends Bike {
	void run()
	{
		System.out.println("running safely");
	}

	public static void main(String[] args) {
		Bike b=new Run();
		b.run();
		

	}

}
