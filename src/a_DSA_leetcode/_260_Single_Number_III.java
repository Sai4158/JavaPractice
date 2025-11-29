package a_DSA_leetcode;

import java.util.HashSet;

public class _260_Single_Number_III {

    public static int[] singleNumber(int[] nums) {
        
    	int  n =  nums.length;
    	
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
        	
            if (hs.contains(num)) {
                hs.remove(num);  
            } 
            
            else {
                hs.add(num);     
            }
        }
    	
        int[] ans = new int[2];
        int i = 0;

        for (int val : hs) {
            ans[i] = val;
            i++;
        }
    	
        
        return ans;
    }
    
    public static int[] singleNumber1(int[] nums) {
        int xor = 0;
        for (int n : nums) {
            xor ^= n;   
        }

        int diff = xor & -xor;   
        int a = 0, b = 0;

        for (int n : nums) {
            if ((n & diff) == 0) {
                a ^= n;  
            } else {
                b ^= n;  
            }
        }

        return new int[]{a, b};
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {1,2,1,3,2,5};
    	System.out.println(singleNumber(nums));
    	
    	int nums1[] = {1,2,1,3,2,5};
    	System.out.println(singleNumber1(nums1));
    	
	}
	
}
