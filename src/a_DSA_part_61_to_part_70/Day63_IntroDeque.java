package a_DSA_part_61_to_part_70;

import java.util.Deque;
import java.util.LinkedList;

public class Day63_IntroDeque {
	
	public static void main(String[] args) {
//		Deque  is double ended 
		
		Deque<Integer> dq = new LinkedList<Integer>();
		
		dq.addLast(1);
		
		dq.addFirst(2);
		
		System.out.println(dq);
		
		
//		Remove the last element
		dq.pollLast();
		
		System.out.println(dq);

		
	}
}
