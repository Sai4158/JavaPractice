package a_DSA_part_61_to_part_70;

import java.util.LinkedList;
import java.util.Queue;

public class Day59_IntroToQueue {
	
//	Queue is FIFO =  first in first out
	
	public static void main(String[] args) {
	
		
		Queue<String> q =  new LinkedList<String>();
		
		q.add("Sai");
		q.add("hello");
		
		System.out.println(q);
		
//		Removes the first element
		q.poll();
		
		System.out.println(q);

		
//		Shows the first element
		System.out.println(q.peek());
		
//		Rules
//		Only can add from last 
//		only can remove form the front 
		
		
//		both time complexity is  o of n 
//		poll - will remove front only 
		
		
//		Just like real life queue 
		
	}
}
