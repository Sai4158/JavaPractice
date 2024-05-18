package queue_p51;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AD_prac1 {
	public static void main(String[] args) {
		//Array of numbers 
		Integer num[] = {342,43,435,734,54,345,56};

		//priority queue
		ArrayDeque<Integer> pq2 = new ArrayDeque<Integer>(Arrays.asList(num));

		//print it out
		System.out.println(pq2);

		//add 
		pq2.offer(11);
		pq2.offerLast(22);
		pq2.offerFirst(00);

		//print it out
		System.out.println(pq2);


		//remove - first and poll
		pq2.pollFirst();

		pq2.poll();

		//print it out
		System.out.println(pq2);

	}
}
