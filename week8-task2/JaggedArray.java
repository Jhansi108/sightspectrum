package task2;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][]=new int[3][];
		arr[0]=new int[4];
		arr[1]=new int [6];
		arr[2]=new int [8];
		int count=0;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=count++;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
