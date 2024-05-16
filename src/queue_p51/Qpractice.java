package queue_p51;

import java.util.Comparator;
import java.util.PriorityQueue;

import javax.sound.sampled.ReverbType;

public class Qpractice {
	public static void main(String[] args) {
		//priority queue
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		//to add - add, offer
		//will be priority only for lowest int head 
		pq.offer(932);
		pq.offer(34);
		pq.add(2);
		pq.offer(43);
		pq.add(1);
		pq.offer(34);
		
		System.out.println(pq);
		
		//peek will always give you the head 
		System.out.println(pq.peek());
		
		//poll - will remove current head and then print rest
		System.out.println(pq.poll());
		System.out.println(pq);
		
		//contains 
		System.out.println(pq.contains(1));
		
		System.out.println("----------------------");
		
		//if you for each loop to print
		//it will not give you head or anything
		//it will print in the order I gave
		
		//but you can use WHILE loop to print 
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
