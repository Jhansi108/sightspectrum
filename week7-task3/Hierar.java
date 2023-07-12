package Task3;
class Classroom{
	void clean()
	{
		System.out.println("Cleaning");
	}
}
class Boys extends Classroom{
	void shout()
	{
		System.out.println("Shouting");
	}
}
class Girls extends Classroom{
	void laugh()
	{
		System.out.println("Laughing");
	}
}

public class Hierar {

	public static void main(String[] args) {
		Girls g=new Girls();
		g.laugh();
		g.clean();

	}

}
