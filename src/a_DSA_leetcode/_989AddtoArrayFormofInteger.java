package a_DSA_leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class _989AddtoArrayFormofInteger {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        
    	int n =  num.length;
    	
    	String c1 = "";
    	
    	for (int i = 0; i < n; i++) {
			
    		c1 +=  Integer.toString(num[i]);
    		
		}
    	
    	
        BigInteger bigNum = new BigInteger(c1);
        BigInteger sum = bigNum.add(BigInteger.valueOf(k));
        String c2 = sum.toString();

    	
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < c2.length(); i++) {
            ans.add(c2.charAt(i) - '0');  
        }
    	
    	return ans;
    }
    
    public static void main(String[] args) {
		
    	int num[] = {1,2,0,0}, k = 34;
    	System.out.println(addToArrayForm(num, k));
	}
	
}
