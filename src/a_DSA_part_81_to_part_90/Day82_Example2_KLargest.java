package a_DSA_part_81_to_part_90;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Day82_Example2_KLargest {

	public static void main(String[] args) {

		int[] nums = {5, 10, 2, 8, 7};
		int k = 3;
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < nums.length; i++) {
			q.add(nums[i]);
		}

		for (int i = 0; i < q.size(); i++) {
			
			System.out.println(q.poll());
		}
		
	}
}
