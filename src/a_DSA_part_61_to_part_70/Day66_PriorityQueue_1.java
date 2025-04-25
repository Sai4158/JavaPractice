package a_DSA_part_61_to_part_70;

import java.util.PriorityQueue;

public class Day66_PriorityQueue_1 {

	public static void main(String[] args) {
		
		int nums[] = {2,4,5,6,3,};

		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
		
		PQ.add(3);		
		PQ.add(4);		
		PQ.add(6);		
		PQ.add(2);		
		PQ.add(7);		
		
		
		for (int i = 0; i < nums.length; i++) {
					
			PQ.add(nums[i]);
		
			System.out.println("Removed" + PQ.poll());
		}
		
	}
}
