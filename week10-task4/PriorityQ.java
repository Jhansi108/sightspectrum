package task4;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("program");
		pq.add("laptop");
		pq.add("key");
		System.out.println("head:"+pq.element());
		System.out.println("head:"+pq.peek());
		System.out.println("iterating the pq elemnts");
		Iterator itr=pq.iterator();
		while(itr.hasNext())
		{
         System.out.println(itr.next());
	}
		pq.remove();
		pq.poll();
		System.out.println("remove two elements:");
		Iterator<String> itr1=pq.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		

}}
