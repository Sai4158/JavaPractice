package a_DSA_part_51_to_part_60;

import java.util.Arrays;

public class Day52_Find_Target_in_Sorted_Array {

	public static int FindTargetSortedArray(int nums[], int target ) {
		
		Arrays.sort(nums);

		int n =  nums.length;
		int l = 0;
		int r = n-1;
				
		while(l<r) {
			int mid =  l + (r-l)/2;
			
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] > target) {
				r = mid -1;
			}else {
				l =  mid +1;
			}
			
		}
		return -1;
	}

	
	public static void main(String[] args) {
		int nums[] = {4,5,6,6,23,45,7,5,8,3,23,4,6,78};
		int target = 45;
		
		System.out.println(FindTargetSortedArray(nums, target));
	}
}
