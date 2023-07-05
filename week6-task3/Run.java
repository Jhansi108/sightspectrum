package task3;
class movie{
	public void ticket()
	{
		System.out.println("theatre");
	}
	
}
class jhansi extends movie{
	public void ticket()
	{
		System.out.println("hall");
	}
}

public class Run {

	public static void main(String[] args) {
		movie m=new jhansi();
		m.ticket();
		

	}

}
