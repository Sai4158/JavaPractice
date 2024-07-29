package collections;

import java.util.LinkedList;

public class Prac1_linkedList {
	public static void main(String[] args) {
		
//		this is the linked list  -  Can be FIFO or LIFO
		
		LinkedList<Integer> L1 = new LinkedList<Integer>();
		LinkedList<Integer> L2 = new LinkedList<Integer>();
		
		L2.add(124);

		L1.add(1);
		L1.add(2);
		L1.add(3);
		
		
		
		System.out.println(L1);
				
//		this first in first out - FIFO
		System.out.println(L1.peek());
		
//		Using add all method to add all the 
		L1.addAll(L2);
		System.out.println(L1);

	}
}
