package task1;

import java.util.regex.Pattern;

public class RegexCharacter {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-z]", "g"));
		System.out.println(Pattern.matches("[a-zA-Z]", "good"));

	}

}
