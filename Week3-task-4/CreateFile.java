package task4;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File myobj=new File("C:\\Users\\SSLTP11422\\Desktop\\Demo.txt");
			if(myobj.createNewFile())
			{
				System.out.println("File is created");
			}
			else {
				System.out.println("File already exists");
			}
		}catch(Exception e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
