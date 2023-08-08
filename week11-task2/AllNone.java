package task2;

import java.util.EnumSet;

enum days{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class AllNone {

	public static void main(String[] args) {
		EnumSet<days> s1=EnumSet.allOf(days.class);
System.out.println("week days:" + s1);

		EnumSet<days> s2=EnumSet.noneOf(days.class);
		System.out.println("week days:" + s2);

	}

}
