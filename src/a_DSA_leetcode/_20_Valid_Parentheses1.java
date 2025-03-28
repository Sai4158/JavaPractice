package a_DSA_leetcode;

import java.util.Stack;

public class _20_Valid_Parentheses1 {

	public static boolean isValid(String s) {

		Stack<Character> st = new Stack<>();


		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if(c == '(' || c == '{' || c == '[') {
				st.push(c);
			}else {

				if(st.isEmpty()) {
					return false;
				}


				char TopPop = st.pop();

				if(c == ')' && TopPop != '(' ||
						c == ']' && TopPop != '[' ||
						c == '}' && TopPop != '{' ) {
					
					return false;

				}

			}

		}
		
//		if it works -  the stack should be empty
		return st.isEmpty();

	}

	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println(isValid(s));
		
		String s1 = "()[]{}(([])";
		System.out.println(isValid(s1));
	}
}
