package task1;

import java.util.Arrays;

public class SortAscending {

	public static void main(String[] args) {
		int[]array=new int[] {2,77,99,86,45,32,1};
		Arrays.sort(array);
		System.out.println("Elements of array are sorted in ascending order");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}

	}

}
