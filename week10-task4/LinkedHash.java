package task4;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash {

	public static void main(String[] args) {
		LinkedHashSet<String> lh=new LinkedHashSet();
		lh.add("qwe");
		lh.add("tyuj");
		lh.add("oplk");
		Iterator<String> itr=lh.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
