package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		String[] array= {"java","program","laptop","keys"};
		
			System.out.println("printing array:" + Arrays.toString(array));
			List<String> list=new ArrayList<String>();  
	   for(String lang:array)
	   {
		   list.add(lang);
	   }
	   System.out.println("printing list" + list);
		

	}

}
