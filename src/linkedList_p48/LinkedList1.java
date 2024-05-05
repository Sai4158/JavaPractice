package linkedList_p48;

import java.util.*;

public class LinkedList1 {
	public static void main(String[] args) {
		
		//linked List
		LinkedList<String> LL1 = new LinkedList<String>();
		//Linked list implements - list and Dequeue
		LL1.add("Ha");
		LL1.add("Hb");
		LL1.add("Hc");
		
		//add based on the index too 
		LL1.add(0,"H0");
		System.out.println(LL1);
	}
}
