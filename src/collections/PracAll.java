package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class PracAll {
	public static void main(String[] args) {
		//array of numbers
		Integer n1[] = {34,324,432,732,543,43}; 
		Integer n2[] = {34,324,432,732,543,43}; 

		//using arrays.aslist(n1)
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(n1));
		//print out the array
		System.out.println(al + "\n");
		
		
		Stack<Integer> s1 = new Stack<Integer>();
		s1.add(23);
		s1.add(12);
		s1.add(43);
		s1.set(0, 342);
		
		//print out the array
		System.out.println(s1);
		System.out.println(s1.peek());
		
		
		//Vector 
		Vector<Integer> v1 = new Vector<Integer>(Arrays.asList(n1));
		System.out.println(v1);
		
		//Linked list 
		LinkedList<Integer> L1 = new LinkedList<Integer>(Arrays.asList(n2));
		for(Integer s: L1){
			System.out.print(s);
		}
				
	}
}
