package a_DSA_leetcode;

import java.util.HashMap;

public class _136_Single_Number {
	 public static int singleNumber(int[] nums) {
		 
			HashMap<Integer, Integer> h1 =  new HashMap<>();
	        
	         for (int num : nums) {
	        	h1.put(num, h1.getOrDefault(num, 0)+1);
	        }
	        
//	        for each to get the key
	        for (int key : h1.keySet()) {
				if(h1.get(key) ==1) {
					return key;
				}
			}
	        
	        return -1;   
   
	    }
	 
	 public static void main(String[] args) {
		 int arr[] = {3,4,1,3,4};
		System.out.println(singleNumber(arr));
	}
}	
