package a_DSA_part_41_to_part_50;

import java.util.Arrays;

public class Day43_Max_Number_of_K_Sum_Pairs {
	
	public static int maxOperations(int[] nums, int k) {
		
		int count = 0;
		int l = 0;
		int n = nums.length;
		int r = n-1;
		
		
		Arrays.sort(nums);
		
    	while(l<r) {
			
			if(nums[l] + nums[r] == k) {
				count++;
				l++;
				r--;
			}
			
			else if(nums[l] + nums[r] < k) {
				l++;
			}else {
				r--;
			}
			
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		int k = 5;
		int nums[] = {3,1,3,4,3};
		
		System.out.println(maxOperations(nums, k));
	}
	
	
}
