package task2;

public class Inheritance {
		float salary=40000;	

	}
class Program extends Inheritance{
	int bonus=10000;
	public static void main(String[]args) {
	Program p=new Program();
	System.out.println("Program salary is:"+p.salary);
	System.out.println("Bonus of the program is:"+p.bonus);
}
}



