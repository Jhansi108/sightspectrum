package task3;

import java.util.Iterator;
import java.util.Vector;

public class VectorL {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("program");
		v.add("laptop");
		v.add("keys");
		v.add("charger");
		Iterator<String> itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
