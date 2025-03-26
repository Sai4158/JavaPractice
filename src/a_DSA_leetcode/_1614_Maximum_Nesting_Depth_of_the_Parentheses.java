package a_DSA_leetcode;

import java.util.Stack;

public class _1614_Maximum_Nesting_Depth_of_the_Parentheses {

	public static int maxDepth(String s) {

		Stack<Character> st = new Stack<>();

		int count = 0;
		int ans =  0;
		
		for (int i = 0; i < s.length(); i++) {

			if(s.charAt(i) == '(') {
				st.push(s.charAt(i));
				count++;
				ans =  Math.max(ans, count);
			}
			else if(s.charAt(i) == ')') {
				st.pop();
				count--;
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));    
	}
}
