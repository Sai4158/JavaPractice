package a_DSA_leetcode;

public class _3019_Number_of_Changing_Keys {
	
    public static int countKeyChanges(String s) {

    	s = s.toLowerCase();
    	
    	int n = s.length();
        int ans  = 0;
        
        
    	for (int i = 0; i < n-1; i++) {
			
    		if(s.charAt(i) != s.charAt(i+1) ) {
    			ans++;
    		}
		}
    	
    	return ans;
        
    }
	
	
	public static void main(String[] args) {
		String s  = "AaAaAaaA";
		System.out.println(countKeyChanges(s));
	}
}	
