package a_DSA_leetcode;

public class _1317_Convert_Integer_to_the_Sum_of_Two_No_Zero_Integers {
	
    public static int[] getNoZeroIntegers(int n) {
             	
    	for (int i = 0; i < n; i++) {
		
    		
    		int j = n-i;
    		
    		if(!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0") ) {
    			return new int[] {i,j};
    		}
		}
    	return new int[] {};
    }
	
	public static void main(String[] args) {
		int n = 11;
		
		System.out.println(getNoZeroIntegers(n));
	}
}
