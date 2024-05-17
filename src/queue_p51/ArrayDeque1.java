package queue_p51;

import java.util.ArrayDeque;

public class ArrayDeque1 {
	public static void main(String[] args) {
		
		//this is how to create array Deque
		
	ArrayDeque<String> s1 = new ArrayDeque<String>();
	s1.add("Sai");
	s1.add("nav");
	s1.add("ssq");
	s1.add("aef");
	//will add in the first
	s1.addFirst("first");
	//will add in the last
	s1.addLast("last11");
	
	//offer will always add in the last
	s1.offer("last00");

	//poll will remove the last element
	//or u can use poll last
	s1.poll();
	
	//will remove the first element using pool
	s1.pollFirst();
	
	//this will print the size of the array
	System.out.println(	s1.size());

	
	//for each
	for(String s:s1) {
		System.out.println(s1);
	}
		
	}
}
