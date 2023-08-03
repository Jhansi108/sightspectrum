package task4;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayQ {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("charge");
		dq.add("mobile");
		dq.add("pin");
		//traversing elements
		for(String s:dq)
		{
			System.out.println(s);
		}

	}

}
