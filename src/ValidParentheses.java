import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        
    	Stack<Character> ST = new Stack<Character>();
    	
    	for (int i = 0; i < s.length(); i++) {
			
    		char c = s.charAt(i);
    		
    		if(c == '(' || c == '{' || c == '[') {
    			ST.push(c);
    		}
    		
    		
    		else {
    			if(ST.empty()) {
    				return false;
    			}
    		}
    		
    		
    		char TopPop = ST.pop();
    		
    		if(c == ')' && TopPop != '(' ||
					c == ']' && TopPop != '[' ||
					c == '}' && TopPop != '{' ) {
				
				return false;

			}

    	}
    	
    	return ST.isEmpty();
    	
    }
    
    
	public static void main(String[] args) {
		String s = "()";
		System.out.println(isValid(s));
	}
	
}
