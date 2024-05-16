package queue_p51;

import java.util.PriorityQueue;

public class Qpractice {
	public static void main(String[] args) {
		//priority queue
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		//to add - add, offer
		//will be priority only for lowest int head 
		pq.offer(932);
		pq.add(1);
		pq.offer(34);
		
		System.out.println(pq);
		
		//peek will always give you the head 
		System.out.println(pq.peek());
		
		//poll - will remove current head 
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}
