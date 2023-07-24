package task1;

import java.util.regex.Pattern;

public class PatternRegax {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("program", "program"));
		System.out.println(Pattern.matches("program p*p", "program"));

	}

}
