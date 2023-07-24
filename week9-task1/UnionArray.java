package task1;

import java.util.Iterator;
import java.util.TreeSet;

public class UnionArray {

	public static void main(String[] args) {
		int[]arr1= {1,2,4,5,7};
		int[]arr2= {8,9,10,3,6};
		int m=arr1.length;
		int n=arr2.length;
		 TreeSet<Integer>set=new TreeSet<>();
		 for(int i=0;i<m;i++)
		 {
			 set.add(arr1[i]);
		 }
		 for(int i=0;i<n;i++)
		 {
			 set.add(arr2[i]);
		 }
		 Iterator<Integer>iterator=set.iterator();
		 while(iterator.hasNext())
		 {
			 System.out.print(iterator.next()+" ");
		 }
		

	}

}
