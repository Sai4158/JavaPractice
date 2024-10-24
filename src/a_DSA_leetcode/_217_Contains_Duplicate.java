package a_DSA_leetcode;

import java.util.HashSet;

public class _217_Contains_Duplicate {
	 public static boolean containsDuplicate(int[] nums) {

//		 HashSet - no order, no dupes
		 HashSet<Integer> set =  new HashSet<Integer>();
		 
		 
		 for (int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				return true;
				
			}
			set.add(nums[i]);
		}
		 
		 return false;
		 
	 }
	 
	public static void main(String[] args) {
		
		int arr[] = {2,4,4,1};
		int arr1[] = {2,4,5};
		
		System.out.println(containsDuplicate(arr));
		System.out.println(containsDuplicate(arr1));
	}
}
