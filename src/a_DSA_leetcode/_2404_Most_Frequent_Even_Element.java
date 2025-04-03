package a_DSA_leetcode;

import java.awt.image.Kernel;
import java.util.HashMap;
import java.util.HashSet;

public class _2404_Most_Frequent_Even_Element {
	
    public static int mostFrequentEven(int[] nums) {
        
    	int n =  nums.length;
    	
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < n; i++) {
			
    		int val =  nums[i];
    		
    		
    		if(val % 2 == 0) {
    			hm.put(val, hm.getOrDefault(val, 0)+1);
    		}
		}
    	
    	
    	int ans = -1;
    	int maxFreq = 0;
    	
    	for(int a :  hm.keySet()) {
    		
    		int freq = hm.get(a);
    		
    		if(freq > maxFreq) {
    			maxFreq =  freq;
    			
    			ans = a;
    			
    		}else if(freq == maxFreq && a < ans){
    			ans = a;
    		}
    	}
    	return ans;
    }
	
	public static void main(String[] args) {
		int nums[] = {0,1,2,2,4,4,1};
		System.out.println(mostFrequentEven(nums));
	}
}
