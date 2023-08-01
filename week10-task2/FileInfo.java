package task2;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\SSLTP11422\\Desktop\\Pro.txt");
		if(f.exists())
		{
			System.out.println("the name of the file is: " + f.getName());
			System.out.println("the absolute path of the file is: " + f.getAbsolutePath());
			System.out.println("is file writeable: " + f.canWrite());
			System.out.println("is file readable: " + f.canRead());
			System.out.println("the size of the byte is: " + f.length());
		}
		else
		{
			System.out.println("the file already exists");
		}

	}

}
