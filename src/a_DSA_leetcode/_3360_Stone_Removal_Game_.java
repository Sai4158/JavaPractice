package a_DSA_leetcode;

public class _3360_Stone_Removal_Game_ {

    public static boolean canAliceWin(int n) {
        
    	int alice = 10;
    	boolean aliceTurn =  true;
    	
    	while(alice>0) {
    		if(n >  alice) {
    			return aliceTurn =  false;
    		}
    		
    		n -= alice;
    		alice--;
    		aliceTurn = false;
    	}
    	
    	return false;
    		
    }
	
    public static void main(String[] args) {
		
    	int n = 19;
    	System.out.println(canAliceWin(n));
    	
	}
    
}
