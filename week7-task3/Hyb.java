package Task3;
class Grandfather{
	public void showG()
	{
		System.out.println("He is a Grandfather");
	}
	
}
class Father extends Grandfather{
	public void showF()
	{
		System.out.println("He is a Father");
	}
}
class Son extends Father{
	public void showS()
	{
		System.out.println("He is a Son");
	}
}

public class Hyb extends Father {
	public void showH()
	{
		System.out.println("Hyb");
	}

	public static void main(String[] args) {
		Son s=new Son();
		s.showF();
		s.showG();
		s.showS();
		Hyb h=new Hyb();
		h.showF();
		h.showG();
		h.showH();
		

	}

}
