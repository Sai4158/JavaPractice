package a_DSA_leetcode;

import java.util.Stack;

public class _3174_Clear_Digits {
	
    public static String clearDigits(String s) {
        
    	Stack<Character> st = new Stack<>();
    	
    	
    	for (int i = 0; i < s.length(); i++) {
			
    		char val =  s.charAt(i);
    		
    		if(Character.isDigit(val)) {
    			if(!st.isEmpty()) {
    				st.pop();
    			}
    		}else {
    			st.push(val);
    		}
    		
		}
    	
    	StringBuilder sb =  new StringBuilder();
    	for(char b: st) {
    		sb.append(b);
    	}
    	
    	return sb.toString();
    }
    
    public static void main(String[] args) {
    	 System.out.println(clearDigits("abc23")); 
	}
}
