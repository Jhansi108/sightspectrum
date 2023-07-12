package Task3;
class Mobile{
	void apps()
	{
		System.out.println("App");
	}
}
class Charger extends Mobile{
	void install()
	{
		System.out.println("Download");
	}
}
class Backcover extends Charger{
	void remove()
	{
		System.out.println("Update");

	}
}

public class MultiLevel {

	public static void main(String[] args) {
		Backcover b=new Backcover();
		b.apps();
		b.install();
		b.remove();
		

	}

}
