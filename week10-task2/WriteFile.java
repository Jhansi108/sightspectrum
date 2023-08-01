package task2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter w=new FileWriter("C:\\Users\\SSLTP11422\\Desktop\\Pro.txt");
			w.write("file handling");
			w.close();
			System.out.println("content successfully added");
		}
		catch(IOException e)
		{
			System.out.println("unexpected error occured");
			e.printStackTrace();
		}

	}

}
