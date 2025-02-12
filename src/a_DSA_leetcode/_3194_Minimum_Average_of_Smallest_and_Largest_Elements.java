package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _3194_Minimum_Average_of_Smallest_and_Largest_Elements {
	
    public static double minimumAverage(int[] nums) {
        
    	int min = 0;
    	int max = 0;
    	int n = nums.length;
    	int ans = 0;
    	
    	Arrays.sort(nums);
    	
    	ArrayList<Integer>al1 = new ArrayList<Integer>();
    	ArrayList<Double>avg = new ArrayList<Double>();

    	
    	for (int i = 0; i < nums.length; i++) {
			al1.add(nums[i]);
		}
    	
    	
    	for (int i = 0; i < n/2; i++) {

    		min  = al1.remove(0);
    		max =  al1.remove(al1.size()-1);
    		
    		avg.add((min + max) / 2.0);
    		
    	}
    	
    	return Collections.min(avg);
    }
	
	public static void main(String[] args) {
			
		int nums[] = {7,8,3,4,15,13,4,1};
		
		System.out.println(minimumAverage(nums));
	}

}

