package Task4;
class Polygon{
	public void render() {
		System.out.println("rendering polygon");
		
	}
}
class square extends Polygon{
	public void render()
	{
		System.out.println("rendering square");
	}
	
}
class circle extends Polygon{
	public void render()
	{
		System.out.println("rendering circle");
	}
}

public class Polymor {

	public static void main(String[] args) {
		square s=new square();
		s.render();
		circle c=new circle();
		c.render();

	}

}
