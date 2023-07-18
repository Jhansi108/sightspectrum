package task2;

public class Reverse {

	public static void main(String[] args) {
		int number=45678,reverse=0;
		while (number>0)
		{
			int remainder=number%10;//456%10,45%10,4%10,
			reverse=reverse *10 + remainder;//4567,456,45,4,0
			number=number/10;//8,7,6,5,4
		}
		System.out.println("the reverse of the given number is:" + reverse);//8,7,6,5,4

	}

}
