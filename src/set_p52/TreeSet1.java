package set_p52;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		//Sorted order = TreeSet
		//TreeSet -> TreeMap -> binary tree
		
		//this will print in the sorted order from smallest to largest
		
		TreeSet<Integer> t1 =  new TreeSet<Integer>();

		//add them in
		t1.add(32);
		t1.add(23);
		t1.add(43);
		t1.add(54);
		t1.add(67);

		//print it out
		System.out.println(t1);

		//print in in reverse
		System.out.println(t1.descendingSet());

		//print the smallest 
		System.out.println("Smalled = " + t1.first());

		//subset - print all the nums between these two nums 
		System.out.println(t1.subSet(20, 55));
		//[23, 32, 43, 54]

		//print the largest 
		System.out.println("Largest = " + t1.last());

		//poll - remove 
		System.out.println(t1.pollFirst());
		System.out.println(t1);

		//remove -  remove
		System.out.println(t1.remove(67));
		System.out.println(t1);

	}
}
