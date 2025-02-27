package a_DSA_leetcode;

public class _921_Minimum_Add_to_Make_Parentheses_Valid {

    public static int minAddToMakeValid(String s) {
        
    	int lcount = 0;
    	int rcount = 0;
    	
    	int n =  s.length();
    	
    	for (int i = 0; i <n; i++) {
			
    		if(s.charAt(i) == '(') {
    			lcount++;
    		}else {
    			if(lcount>0) {
    				
    				lcount--;
    			}else {
    				rcount++;
    			}
    		}
    		
		}
    	
    	return lcount + rcount;
    }
	
	public static void main(String[] args) {
		System.out.println(minAddToMakeValid("())")); 
        System.out.println(minAddToMakeValid("((("));
	}
}
