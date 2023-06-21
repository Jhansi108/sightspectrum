package Task2;
import java.util.*;
public class Variable {
	static int a=m1();
	static
	{
	System.out.println("Inside the block");	
	}
	static int m1()
	{
		System.out.println("from m1");
		return 20;
	}
			

	public static void main(String[] args) {
		System.out.println("value of a: +a");
		System.out.println("from main");
		

	}

}
