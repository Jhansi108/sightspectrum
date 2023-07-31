package task1;

public class Split {

	public static void main(String[] args) {
		String s1="He is a very very good boy, is n't he?";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(s1.length());
		System.out.println(w);
		}  

	}

}
