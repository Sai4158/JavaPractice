package a_DSA_leetcode;

public class _367_Valid_Perfect_Square {

    public static boolean isPerfectSquare(int num) {
        
    	for (int i = 1; i * i  < num; i++) {
			
    		if(i * i == num) {
    			return true;
    		}
    		
		}
    	
    	return false;
    }
	

}
