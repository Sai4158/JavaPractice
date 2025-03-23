package a_DSA_part_61_to_part_70;

import java.util.Stack;

public class Day60_ReverseAStringUsingStack {
	
	public static void main(String[] args) {
		
		Stack st = new Stack<>();
		String rev = "";
		String s = "Sai";
		
		for (int i = 0; i < s.length(); i++) {
			st.push(s.charAt(i));
		}
		
		while(!st.isEmpty()) {
			rev+= st.pop();
		}
		
		System.out.println(rev);
	}
}
