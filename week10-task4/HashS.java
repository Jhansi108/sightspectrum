package task4;

import java.util.HashSet;
import java.util.Iterator;

public class HashS {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("mno");
		hs.add("pqrs");
		hs.add("tuvwx");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
