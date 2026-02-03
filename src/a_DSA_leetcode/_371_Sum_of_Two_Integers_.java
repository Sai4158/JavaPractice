package a_DSA_leetcode;

public class _371_Sum_of_Two_Integers_ {

    public int getSum(int a, int b) {
    	
    	if(b == 0) {
    		return a;
    	}
    	
    	return getSum(a ^ b, (a&b) << 1);
    	
    }
	
	public static void main(String[] args) {
		
	}
}
