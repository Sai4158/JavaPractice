package a_DSA_part_81_to_part_90;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Day_81_MaxHeap {

	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		q.add(4);
		q.add(8);
		q.add(3);
		
		
		System.out.println(q);
	}
}
