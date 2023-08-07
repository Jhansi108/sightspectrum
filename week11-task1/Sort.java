package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<String> ab=new ArrayList<>();
		ab.add("mango");
		ab.add("orange");
		ab.add("apple");
		Collections.sort(ab);
		for(String fruit:ab)
			System.out.println(fruit);
		System.out.println("Sorting numbers");
		List<Integer> i=new ArrayList<>();
		i.add(10);
		i.add(20);
		i.add(30);
		Collections.sort(i);
		for(Integer c:i)
			System.out.println(c);

	}

}
