package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StringSort {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("january");
		al.add("february");
		al.add("march");
		al.add("april");
		Collections.sort(al);
		Iterator itr=al.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
					

	}

}
