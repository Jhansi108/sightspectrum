package task1;

import java.util.Deque;

public class ArrayDeque {

	public static void main(String[] args) {
		Deque<String> d=new java.util.ArrayDeque<String>();
		d.add("opq");
		d.add("rst");
		d.add("uvw");
		d.add("xyz");
		for(String ab:d)
			System.out.println(ab);

	}

}
