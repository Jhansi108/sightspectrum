package task1;

public class ReturnArray {
	static int[] get()
	{
		return new int[]{20,40,80,100,50};
	}

	

	public static void main(String[] args) {
		int arr[]=get();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		

	}

}
