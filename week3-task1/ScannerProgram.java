package task2;
import java.util.Scanner;
public class ScannerProgram {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number and name");
	int a;
	String name;
	a=sc.nextInt();
	name=sc.nextLine();
	System.out.println(a+" "+"\n"+name);
	}

}
