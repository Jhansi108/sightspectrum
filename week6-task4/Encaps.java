package task4;
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
		int Area=length*breadth;
		System.out.println("Area: "+ Area);
		
	}
}

public class Encaps {

	public static void main(String[] args) {
		Area rectangle=new Area(5,15);
		rectangle.getArea();
		
	}

}
