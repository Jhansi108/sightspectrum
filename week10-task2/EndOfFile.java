package task2;
import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        int lineNumber = 0;
        while (scanner.hasNext()) {
            lineNumber++;
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
        }


	}

}
