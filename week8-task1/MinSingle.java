package task1;

public class MinSingle {

	public static void main(String[] args) {
		int a[]= {50,100,40,20,60};
		int min=a[0]; 
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
