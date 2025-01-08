package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _3289_The_Two_Sneaky_Numbers_of_Digitville {
	
	public static int[] getSneakyNumbers(int[] nums) {
		
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        	
        int n =  nums.length;
        
        for (int i = 0; i < n; i++) {
			
        	hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
		}
    
        
        
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        
        
        for (int key : hm.keySet()) {
		 
        	if(hm.get(key) ==2 ){
        		a1.add(key);
        	}
		}
        
        return new int[] {a1.get(0), a1.get(1)};
	}
	
	public static void main(String[] args) {
		int nums1[] = {0, 1, 1, 0};
        System.out.println(Arrays.toString(getSneakyNumbers(nums1)));
	}
}
