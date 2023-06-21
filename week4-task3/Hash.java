package Task3;

import java.util.*;

public class Hash {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("monday");
		set.add("tuesday");
		set.add("wednesday");
		Iterator<String>i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
