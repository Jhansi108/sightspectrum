package task1;

import java.util.ArrayList;
import java.util.List;

public class GetSet {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("mango");
		al.add("orange");
		al.add("pine apple");
		al.add("guava");
		System.out.println("returning element:" + al.get(1));
		al.set(1,"leaf");
		for(String fruit:al)
			System.out.println(fruit);

	}

}
