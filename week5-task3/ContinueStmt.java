package task3;

public class ContinueStmt {

	public static void main(String[] args) {
		for(int i=3;i<=5;i++)
		{
			for(int j=i;i<=6;j++)
			{
				if(j==4) {
					continue;
				}
				System.out.println(j);
			}
		}

	}

}
