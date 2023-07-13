package Task4;
class Area{
	int length;
	int breadth;
	Area(int length,int breadth)
	{
		this.breadth=breadth;
		this.length=length;
	}
	public void getArea()
	{
		int area=length*breadth;
				System.out.println("Area:" + area);
	}
}

public class Encaps {

	public static void main(String[] args) {
		Area rec=new Area(4,6);
		rec.getArea();
		

	}

}
