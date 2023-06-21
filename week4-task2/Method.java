package Task2;
import java.util.*;
public class Method {
	static int a=30;
	int b=70;
	void Book()
	{
		System.out.println(a);
		System.out.println(b);
	}
	static void staticBook()
	{
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		Method obj=new Method();
		obj.Book();
		staticBook();
		

	}

}
