package task1;

public class AnonymousSingle {
	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}

	public static void main(String[] args) {
		printArray(new int[] {10,20,30,40});
		
	}

}
