package _B_LC;

import java.lang.reflect.Array;
import java.util.Stack;

public class _ValidParentheses_1 {

	public static void main(String[] args) {
		String s = "()";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {

		Stack<Character> st =  new Stack<Character>();

		for (int i = 0; i < Array.getLength(st); i++) {

			char c = s.charAt(i);


			if(c == '(' || c == '[' || c == '{') {
				st.add(c);

			}
			
			else {
				if(st.isEmpty()) {
					return false;
				}


				char top =  st.pop();

				if(top == ')' && top != '(' ||
						top == '}' && top != '{' ||
						top == ']' && top != '[') {
					
					return false;
				}

			}
		}

		return st.isEmpty();

	}
}
