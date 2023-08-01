package task2;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		try {
		File f1=new File("C:\\Users\\SSLTP11422\\Desktop\\Pro.txt");
		Scanner dataReader=new Scanner(f1);
		while(dataReader.hasNextLine())
		{
			String data=dataReader.nextLine();
			System.out.println(data);
		}
		dataReader.close();

	}
	catch (FileNotFoundException exception)
	{
		System.out.println("an error occured");
		exception.printStackTrace();
	}

}}
