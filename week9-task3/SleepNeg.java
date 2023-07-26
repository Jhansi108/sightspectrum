package task3;

public class SleepNeg {

	public static void main(String[] args) {
		try {
			for(int i=0;i<5;i++)
			{
				Thread.sleep(-200);
				System.out.println(i);
			}
		}
		catch(Exception exn)
		{
			System.out.println(exn);
		}

	}

}
