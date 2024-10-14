package collections;

import java.util.LinkedList;

public class LinkedLi {
	public static void main(String[] args) {
		
		LinkedList<Integer> li =  new LinkedList<Integer>();
		
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		
		
	for (Integer s : li) {
			System.out.print (s+",");
		}
	
		System.out.println();
		
//	Removes the first element
		System.out.println(li.poll());
		
		

		
//		peeks first elements and print its
		System.out.println(li.peek());
		
		
		
		
	}
	
}
