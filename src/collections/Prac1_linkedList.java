package collections;

import java.util.LinkedList;

public class Prac1_linkedList {
	public static void main(String[] args) {
		
//		this is the linked list  -  Can be FIFO or LIFO
		
		LinkedList<Integer> L1 = new LinkedList<Integer>();
		
		L1.add(1);
		L1.add(2);
		L1.add(3);
		
		System.out.println(L1);
		
//		this first in first out
		System.out.println(L1.peek());
	}
}
