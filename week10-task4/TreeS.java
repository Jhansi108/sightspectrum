package task4;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeS {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("mkkln");
		ts.add("okocc");
		ts.add("dsfdv");
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
