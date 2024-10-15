package a_DSA_leetcode;

import java.util.Stack;

public  class _20_Valid_Parentheses {

	public static boolean isValid(String s) {
		Stack<Character> Stack =  new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char first = s.charAt(i);

			if(first == '(' || first == '{' || first == '[') {

				//				 Add to the Stack
				Stack.push(first);

			}else {
				if(Stack.isEmpty()) {
					return false;
				}

				char last = Stack.pop();

				//So a is the first element 
				//Popping from stack is last element
				
				
//				if this not a match the return false 
				if ((first == ')' && last != '(') || 
						(first == '}' && last != '{') || 
						(first == ']' && last != '[')) {
					return false;
				}

			}


		}

		return Stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println(isValid(s));
	}
}
