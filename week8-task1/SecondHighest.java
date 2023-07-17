package task1;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int num[]= {11,22,33,44,55,88,99,66};
		int n=num.length;
		Arrays.sort(num);
		System.out.println("second highest number " +  (n-2));

	}

}
