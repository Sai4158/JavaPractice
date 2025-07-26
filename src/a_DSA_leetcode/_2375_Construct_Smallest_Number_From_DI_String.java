package a_DSA_leetcode;

import java.util.Stack;

public class _2375_Construct_Smallest_Number_From_DI_String {
	
    public static String smallestNumber(String pattern) {
        
    	int n =  pattern.length();
    	StringBuilder ans =  new StringBuilder();
    	
    	Stack<Integer> Stack = new Stack<Integer>();
    	int num = 1;
    	
    	for (int i = 0; i <= n; i++) {
			
    		Stack.push(num++);
    		
    		if(i == pattern.length() || pattern.charAt(i) =='I') {
    			
    			while(!Stack.isEmpty()) {
    				
    				ans.append(Stack.pop());
    				
    			}
    		}
    	}
    	return ans.toString();
    }
	
	public static void main(String[] args) {
		String pattern = "IIIDIDDD";
		System.out.println(smallestNumber(pattern));
	}
}
