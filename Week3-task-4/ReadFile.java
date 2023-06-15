package task4;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		try {
			File myobj=new File("C:\\Users\\SSLTP11422\\Desktop\\Demo.txt");
			Scanner myReader=new Scanner(myobj);
			while(myReader.hasNext()) {
				String data=myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
