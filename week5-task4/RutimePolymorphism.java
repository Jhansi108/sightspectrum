package task4;
class movie{
public void ticket()
{
	System.out.println("theatre");
}
}
class jhansi extends movie
{
	public void ticket()
	{
		System.out.println("markapur");
	}
}

public class RutimePolymorphism {

	public static void main(String[] args) {
		movie jh=new jhansi();
		jh.ticket();
		

	}

}
