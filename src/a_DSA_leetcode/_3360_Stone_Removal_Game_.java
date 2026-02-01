package a_DSA_leetcode;

public class _3360_Stone_Removal_Game_ {

    public static boolean canAliceWin(int n) {
        
//    	Set to 10
    	int alice = 10;
    	
//    	When its the turn set it to true
    	boolean aliceTurn =  true;
    	
//    	if alice10 is greater than 0 do the loop
    	while(alice>0) {
    		
//    		if n < alice10 then return false
    		if(n < alice) {
    			return !aliceTurn; 
    		}
    		
//    		-10 every time
    		n -= alice;
    		
//    		-1 for bob
    		alice--;
    		
//    		Check if this is alice turn
            aliceTurn = !aliceTurn;
    	}
    	
//    	return false 
    	return false;
    		
    }
	
    public static void main(String[] args) {
		
    	int n = 19;
    	System.out.println(canAliceWin(n));
    	
	}
    
}
