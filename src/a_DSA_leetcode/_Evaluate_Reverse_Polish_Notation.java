package a_DSA_leetcode;

import java.util.Iterator;
import java.util.Stack;

public class _Evaluate_Reverse_Polish_Notation {

	 public static int evalRPN(String[] tokens) {

	        Stack<Integer> st = new Stack<>();

	        for (String t : tokens) {

	            if (t.equals("+")) {
	                int b = st.pop();
	                int a = st.pop();
	                
	                st.push(a+b);
	            } 
	            
	            else if (t.equals("-")) {
	                int b = st.pop();
	                int a = st.pop();
	                st.push(a - b);
	            } 
	            
	            else if (t.equals("*")) {
	                int b = st.pop();
	                int a = st.pop();
	                st.push(a * b);
	            } 
	            else if (t.equals("/")) {
	                int b = st.pop();
	                int a = st.pop();
	                st.push(a / b);
	            } 
	            
	            else {
	                st.push(Integer.parseInt(t)); 
	            }
	        }

	        return st.pop();
	    }
    
    
    public static void main(String[] args) {
		
    	String tokens[] = {"2","1","+","3","*"};
    	System.out.println(evalRPN(tokens));
    	
	}
	
}
