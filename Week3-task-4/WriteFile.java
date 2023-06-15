package task4;

import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter=new FileWriter("C:\\Users\\SSLTP11422\\Desktop\\Demo.txt");
			myWriter.write("Jha");
			myWriter.close();
			System.out.println("Successfully updated");
		}
		 catch(Exception e) {
			e.printStackTrace();
		
		}
	}

}
