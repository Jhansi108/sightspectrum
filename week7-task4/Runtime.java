package Task4;
class Shape{
	void draw()
	{
		System.out.println("drawing");
	}
}
class Rectangle extends Shape{
	void draw()
	{
		System.out.println("rectangular");
	}
}
class Pyramid extends Shape{
	void draw()
	{
		System.out.println("hexagon");
	}
}

public class Runtime {

	public static void main(String[] args) {
		Shape s;
		s=new Rectangle();
		s.draw();
		s=new Pyramid();
		s.draw();

	}

}
