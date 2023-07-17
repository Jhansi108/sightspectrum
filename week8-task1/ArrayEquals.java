package task1;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		int[]a1=new int[] {'a','b','c','d','e'};
		int[]a2=new int[] {'a','b','c','d','e'};
		if(Arrays.equals(a1, a2))
		System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");

	}

}
