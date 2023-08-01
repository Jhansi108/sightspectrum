package task2;

import java.io.File;

import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File f=new File("C:\\Users\\SSLTP11422\\Desktop\\Pro.txt");
			if (f.createNewFile())
			{
				System.out.println("File " + f.getName() + "is successfully created");
			}
			else
			{
				System.out.println("it's already exist");
			}
		}
		catch(IOException exception)
		{
			System.out.println("an unexpected error is occured.");
			exception.printStackTrace();
		}
	}

}
