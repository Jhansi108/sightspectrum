package Task4;
class Program{
	static int Multiply (int x,int y) {
		return x*y;
	}
	static int Multiply(int x,int y,int z) {
		return x*y*z;
	}
}
	

public class Compiletimepoly {

	public static void main(String[] args) {
		System.out.println(Program.Multiply(4, 8));
		System.out.println(Program.Multiply(5, 8, 2));
		
		
		

	}

}
