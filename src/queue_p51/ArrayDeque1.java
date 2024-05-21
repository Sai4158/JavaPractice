package queue_p51;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDeque1 {
	public static void main(String[] args) {
		
	//this is how to create array Deque
	ArrayDeque<String> s1 = new ArrayDeque<String>();
	
	Integer q1[] = {34,45,45,545};
	ArrayList<Integer> Al1 =  new ArrayList<>(Arrays.asList(q1));
	
	System.out.println(Al1);
	System.out.println("---------");
	for (int i = 0; i < Al1.size(); i++) {
		System.out.println(Al1);
	}
	
	s1.add("Sai");
	s1.add("nav");
	s1.add("ssq");
	s1.add("aef");
	
	//will add in the first
	s1.addFirst("first");
	//will add in the last
	s1.addLast("last11");
	
	//offer will always add in the last
	s1.offer("last00");
	s1.offer("last01");
	s1.offer("last02");
	s1.offer("last03");
	s1.offer("last04");
	
	//poll will remove the last element
	//or u can use poll last
	s1.poll();
	s1.poll();
	
	//will remove the first element using pool
	s1.pollFirst();
	
	//this will print the size of the array
	System.out.println(	s1.size());

	
	//for each
	for(String s:s1) {
		System.out.println(s1);
	}
		
	}
}
