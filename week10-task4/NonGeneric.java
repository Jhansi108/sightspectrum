package task4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NonGeneric {

	public static void main(String[] args) {
		
	Map<Integer, String> m=new HashMap<>();
	m.put(1, "axcdc");
	m.put(2, "mil");
	m.put(3, "gydgcidb");
	Set s=m.entrySet();
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
		Map.Entry e=(Map.Entry)itr.next();
		System.out.println(e.getKey()+" "+e.getValue());
	}

	}

}
