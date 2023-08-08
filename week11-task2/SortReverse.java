package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortReverse {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("jan");
		a1.add("feb");
		a1.add("mar");
		a1.add("apr");
		Collections.sort(a1,Collections.reverseOrder());
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
