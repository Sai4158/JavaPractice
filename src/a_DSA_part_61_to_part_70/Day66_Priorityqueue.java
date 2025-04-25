package a_DSA_part_61_to_part_70;

import java.util.PriorityQueue;

public class Day66_Priorityqueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
		pq.add(5);
		pq.add(3);
		pq.add(10);
		
		pq.remove();
		
		System.out.println(pq.peek());
		
	}
}
