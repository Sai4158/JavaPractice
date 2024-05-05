package linkedList_p48;

import java.util.*;

import arrayCreation.Array;

public class LinkedList1 {
	public static void main(String[] args) {
		
		//array list 
		ArrayList<String> Al = new ArrayList<String>();
		
		Al.add("S1");
		Al.add("S2");
		
		//linked List
		LinkedList<String> LL1 = new LinkedList<String>();
		//Linked list implements - list and Dequeue
		LL1.add("Ha");
		LL1.add("Hb");
		LL1.add("Hc");
		
		//add based on the index too 
		LL1.add(0,"H0");
		
		
		//this will add all the values in the array list
		//to the linked list using add all 
		// this add it in the first at index at 0
		LL1.addAll(0,Al);
		
	
		//then prints out the final output 
		System.out.println(LL1);
		
		//u can give a index or "" to remove it
		LL1.remove(5);
		LL1.remove("Hb");
		System.out.println(LL1);
		
		
		//u can use for to print the linked list 
		for (String s : LL1) {
			System.out.print(s + ",");
		}
		
		//THIS IS WILL CLEAR THE LIST 
		LL1.clear();
		System.out.println(LL1.peek());
	}
}
