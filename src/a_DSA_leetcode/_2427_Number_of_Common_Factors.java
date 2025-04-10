package a_DSA_leetcode;

import java.util.ArrayList;

public class _2427_Number_of_Common_Factors {
	
    public static int commonFactors(int a, int b) {
        
    	ArrayList<Integer> ans =  new ArrayList<Integer>();
    	int n =  Math.min(a, b);
    	
    	for (int i = 1; i <= n; i++) {
			 if(a % i == 0 && b % i == 0) {
				 ans.add(i);
			 }
		}    	
    	
    	
    	return ans.size();
    	
    }
	
	public static void main(String[] args) {
		
		int a = 12, b = 6;
		System.out.println(commonFactors(a, b));
		
	}
}
