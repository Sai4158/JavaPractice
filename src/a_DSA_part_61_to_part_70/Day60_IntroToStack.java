package a_DSA_part_61_to_part_70;

import java.util.Iterator;
import java.util.Stack;

public class Day60_IntroToStack {

	public static void main(String[] args) {
		
		Stack st = new Stack<>();
		
		
		st.push("apple");
		st.push("doll");
		st.push("ball");
		
		System.out.println(st.peek());
		System.out.println(st);
		
//		Removes the last item
		System.out.println(st.pop());
		System.out.println(st);
		
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
	}
}
