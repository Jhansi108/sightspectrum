package task2;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		 File f = new File("C:\\Users\\SSLTP11422\\Desktop\\Pro.txt");
		if(f.delete())
		{
			System.out.println(f.getName()+ "file deleted successfully.");
			
		}
		else {
			System.out.println("an error occured.");
		}

	}             

}
