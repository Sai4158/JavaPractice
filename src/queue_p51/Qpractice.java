package queue_p51;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

import javax.sound.sampled.ReverbType;

import arrayCreation.Array;

public class Qpractice {
	public static void main(String[] args) {
		//Array of numbers 
		Integer num[] = {3,4,54,76,2,5,654};
		
		//priority queue
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Arrays.asList(num));
		
		
		//this will print the pq1
		//this will print based on the priority
		System.out.println(pq1);
		
		System.out.println();
		
		//this will print using while loop
		while(!pq1.isEmpty()) {
			System.out.print(pq1.poll() + ",");
		}

		System.out.println();
				
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
