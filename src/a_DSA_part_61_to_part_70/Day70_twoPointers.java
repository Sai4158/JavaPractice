package a_DSA_part_61_to_part_70;

import java.util.Arrays;
import java.util.HashSet;

import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

public class Day70_twoPointers {

	public static int distinctAverages(int[] nums) {

		int n =  nums.length;
		HashSet<Double> hs =  new HashSet<Double>();
		int l = 0;
		int r = n - 1;
		Arrays.sort(nums);
		
		while(l<r) {
			double avg =  (nums[l] + nums[r]) / 2.0;
			hs.add(avg);
			
			
			l++;
			r--;
		}
		return hs.size();
	}
	
	public static void main(String[] args) {
		int[] nums = {4, 1, 4, 0, 3, 5};
		System.out.println(distinctAverages(nums)); 
	}
}
