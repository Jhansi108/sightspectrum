package task3;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("jhansi");
		list.add("jashnavi");
		list.add("teja");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
