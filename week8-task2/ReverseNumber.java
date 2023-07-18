package task2;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=65432, reverse=0;
		while (num!=0)
		{
			int remainder=num%10;
			reverse=reverse*10 + remainder;
			num=num/10;
			
		}
		System.out.println("the reverse of the given number is:" + reverse);

	}

}
