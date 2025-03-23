package a_DSA_part_61_to_part_70;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Day59_ForEachQueue {

	public static void main(String[] args) {

		Queue<String> q =  new LinkedList<String>();

		q.add("Sai");
		q.add("hello");


		for(String s :  q) {
			System.out.println(s);
		}
	}
}
