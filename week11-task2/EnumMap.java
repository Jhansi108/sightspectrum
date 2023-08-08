package task2;

import java.util.Map;

public class EnumMap {
	public enum days{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}

	public static void main(String[] args) {
		EnumMap<days,String> map=new EnumMap<days,String>(days.class);
		map.put(days.MONDAY,"1");
		map.put(days.TUESDAY,"2");
		map.put(days.WEDNESDAY,"3");
		map.put(days.THURSDAY,"4");
		map.put(days.FRIDAY,"5");
		map.put(days.SATURDAY,"6");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue()); 
		}
		
		

	}

}
