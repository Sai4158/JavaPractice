package a_DSA_leetcode;

import java.util.Stack;

public class _1021_Remove_Outermost_Parentheses {
	
	public static String removeOuterParentheses(String s) {
		
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        String result = ""; 

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                if (!stack.isEmpty()) result += c;
                stack.push(c);
            } else {
                stack.pop();
                if (!stack.isEmpty()) result += c; 
            }
        }
        return result;
    }

	
	public static void main(String[] args) {
		  String s = "(()())(())";
	        System.out.println(removeOuterParentheses(s));
	}
}
