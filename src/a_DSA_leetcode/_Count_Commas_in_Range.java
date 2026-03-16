package a_DSA_leetcode;

public class _Count_Commas_in_Range {

	
    public static int countCommas(int n) {
        
    	int ans = 0;
    	
    	if(n >= 1000) {
    		
    		ans =  n - 999;
    		
    	}else {
    		return 0;
    	}
    	
    	return ans;
    }
    
    
    
    
    public static void main(String[] args) {
		
    	int n = 998;
    	
    	System.out.println(countCommas(n));
    	
	}
}
