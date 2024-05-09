package collections;

import java.util.Arrays;
import java.util.LinkedList;

// this will split the array using the for loop D
public class Work4_1 {
	public static void main(String[] args) {

		Integer arr[] = {11,2,22,11,30,11,2,2, 1};
		LinkedList<Integer> s1 = new LinkedList<Integer>(Arrays.asList(arr));

		//divide by the size
		int split = s1.size() /2;

		//crate the linked list for the 2 lists
		LinkedList<Integer> List1 = new LinkedList<Integer>();
		LinkedList<Integer> List2 = new LinkedList<Integer>();

		//using the for loop
		for (int i = 0; i < split; i++) {
			List1.add(s1.get(i));
		}
		System.out.println(List1);

		//using the for loop for the second part
		for(int i = split; i<s1.size(); i++) {
			List2.add(s1.get(i));
		}
		System.out.println(List2);

	}
}
