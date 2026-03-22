package a_DSA_leetcode;

public class _Count_Commas_in_Range {

	
    public static int countCommas(int n) {
        
//    	set ans to 0
    	
    	int ans = 0;
    	
    	
//    	if n >= 1000 then ans =
    	if(n >= 1000) {
    		
    		ans =  n - 999;
    		
    		
    	}
    	
    	// or else return 0
    	else {
    		return 0;
    	}
    	
    	return ans;
    }
    
    
    
    
    public static void main(String[] args) {
		
    	int n = 998;
    	
    	System.out.println(countCommas(n));
    	
	}
}
