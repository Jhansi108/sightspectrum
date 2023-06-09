package task4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
	HashMap<String , Integer> map=new HashMap<>();
	map.put("jhansi", 11402);
	map.put("siva", 11223);
	map.put("nagendra", 11234);
	 for(Map.Entry m : map.entrySet()) {
		 System.out.println(m.getKey()+" "+m.getValue());
	 }
	
	

	}
}
 