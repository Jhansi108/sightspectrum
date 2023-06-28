package task3;

public class IfElseIfLadder {

	public static void main(String[] args) {
		int marks=70;
		if (marks<50) {
			System.out.println("A grade");
		}
		else if(marks>=90&&marks<75)
		{
			System.out.println("B grade");
		}
		else if(marks>=75&&marks>40)
		{
			System.out.println("C grade");
		}
		else if(marks<=9&&marks>20)
		{
			System.out.println("D grade");
		}
		else {
			System.out.println("fail");
		}
		

	}

}
