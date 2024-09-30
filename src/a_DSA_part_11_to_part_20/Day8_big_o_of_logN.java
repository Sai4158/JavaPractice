package a_DSA_part_11_to_part_20;

import java.util.PriorityQueue;

public class Day8_big_o_of_logN {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(5);
		System.out.println(pq); // O(log n) to remove the smallest element
		System.out.println(pq.peek());
	}
}
