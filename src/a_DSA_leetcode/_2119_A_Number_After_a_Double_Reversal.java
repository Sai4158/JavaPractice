package a_DSA_leetcode;

public class _2119_A_Number_After_a_Double_Reversal {
	
    public static boolean isSameAfterReversals(int num) {
        

    	if(num ==  0) {
    		return true;
    	}
    	
    	if(num % 10 == 0) {
    		return false;
    	}else {
    		return true;
    	}
    	
    }
	
	
	public static void main(String[] args) {
		int num = 526;
		System.out.println(isSameAfterReversals(num));
	}
}
