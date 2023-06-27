package task2;
import java.util.Scanner;
public class ScannerProgram {

	public static void main(String[] args) {
		System.out.println("what is your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("enter the number");
		int i=sc.nextInt();
		System.out.println(name + " is a nice name"+" "+ i);
		
		
		

	}

}
