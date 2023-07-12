package Task3;
 abstract class Mytest{
	abstract void Calculate(int a,int b);
}
 class Addition extends Mytest{
	 void Calculate(int a,int b)
	 {
		 int x=a+b;
		 System.out.println("Add:" + x);
	 }
 }
 class Subtraction extends Mytest{
	 void Calculate(int a,int b)
	 {
		 int y=a-b;
		 System.out.println("Sub:" + y);
	 }
 }
 class Multiplication extends Mytest{
	 void Calculate(int a,int b) 
	 {
		 int z=a*b;
		 System.out.println("Mul:" + z);
	 }
 }

public class MyClass {

	public static void main(String[] args) {
		Addition a=new Addition();
		Subtraction s=new Subtraction();
		Multiplication m=new Multiplication();
		a.Calculate(75, 25);
		s.Calculate(25, 15);
		m.Calculate(7, 9);
		

	}

}
