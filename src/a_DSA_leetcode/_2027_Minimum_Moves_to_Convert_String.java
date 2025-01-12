package a_DSA_leetcode;

public class _2027_Minimum_Moves_to_Convert_String {

    public static int minimumMoves(String s) {
        
    	
    	int count = 0;
    	int n =  s.length();
    	
        for (int i = 0; i < n; i++) {
			
    		if (s.charAt(i) == 'X') {
                count++;
                i += 2; 
            }
    	}
    	return count;
    	 
    }
    
    public static void main(String[] args) {
	
    	String s  = "xx0x";
    	
    	System.out.println(minimumMoves(s));
    	
	}
	
}
