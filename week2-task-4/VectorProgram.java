package task4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class VectorProgram {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("10");
		list.add("20");
		list.add("40");
		list.add("30");
		list.add("50");
		Collections.sort(list);
		Iterator<String>ir=list.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
