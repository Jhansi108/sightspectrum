package task1;

public class MaxSingle {

	public static void main(String[] args) {
		int a[]= {50,100,40,20,60};
		int max=a[0]; 
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
		

	}

}
