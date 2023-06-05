package task4;
class addition{
	public void run(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
class Sub extends addition{
	public void run(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
public class test {
public static void main(String[] args) {
	Sub s=new Sub();
	s.run(10,10, 10);
	s.run(20, 20,20);
}
}
