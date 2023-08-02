package task3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedL {

	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		li.add("gayathri");
		li.add("rufiya");
		li.add("sailu");
		Iterator<String> itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
