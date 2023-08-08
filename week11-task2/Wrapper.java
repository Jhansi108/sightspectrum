package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Wrapper {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(210));
		al.add(250);
		Collections.sort(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
