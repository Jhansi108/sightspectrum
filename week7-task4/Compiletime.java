package Task4;
class number{
	int add(int a,int b)
	{
		return a+b;
	} 
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
}

public class Compiletime {

	public static void main(String[] args) {
		number n=new number();
		System.out.println((n.add(8, 9)));
		System.out.println((n.add(2, 4, 6)));
		

	}

}
