package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		ArrayList<Character>array=new ArrayList<>();
		array.add('a');
		array.add('e');
		array.add('b');
		array.add('c');
		array.add('d');
		Collections.sort(array);
		Iterator<Character> itr=array.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
