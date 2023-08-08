package task2;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class Enum {

	public static void main(String[] args) {
		Set<days> s=EnumSet.of(days.THURSDAY, days.MONDAY);
		Iterator<days> itr=s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
