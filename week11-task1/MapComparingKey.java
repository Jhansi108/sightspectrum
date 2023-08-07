package task1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapComparingKey {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(701,"apple");
		m.put(702, "bat");
		m.put(703, "cat");
		m.put(704, "dog");
		
		m.entrySet()  
	        
	      .stream()  
	      
	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
	     
	      .forEach(System.out::println);  
		

	}

}
