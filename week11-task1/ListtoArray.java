package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListtoArray {

	public static void main(String[] args) {
          List<String> all=new ArrayList<String>();
          all.add("abc");
          all.add("defg");
          all.add("klmn");
          String[]array=all.toArray(new String[all.size()]);
          System.out.println("printing array:" + Arrays.toString(array));
          System.out.println("printing list:" + all);
          
	}

}
