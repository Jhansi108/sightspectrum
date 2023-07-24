package task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		//way 1//
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		//way2//
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		//way 3//
		boolean b3=Pattern.matches(".s", "as");
		System.out.println(b+" " + b2 +" " + b3);

	}

}
