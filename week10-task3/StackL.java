package task3;

import java.util.Iterator;
import java.util.Stack;

public class StackL {

	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		st.push("abc");
		st.push("defg");
		st.push("hijkl");
		st.push("mnopqr");
		Iterator<String> itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
