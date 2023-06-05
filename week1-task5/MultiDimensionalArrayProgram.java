package task5;

public class MultiDimensionalArrayProgram {

	public static void main(String[] args) {
		try {
		int apples[][]= {{10,11,12,13}, {14,15,16,17}, {18,19,20,21}};
		for(int i=0;i<=apples.length;i++)
		{
			for(int j=0;j<=apples.length;j++)
			{
				System.out.print(apples[i][j]+" ");
			}
	}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
}

	

}
