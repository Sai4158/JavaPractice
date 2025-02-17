package a_DSA_part_51_to_part_60;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Day51_two_numbers_in_a_sorted_array_sum_to_a_target {

	
	public static boolean findTwo(int nums[], int target) {
		
		int l = 0;
		int n = nums.length;
		int r = n-1;
		Arrays.sort(nums);
		
		while(l<r) {
			
			if(nums[l] +  nums[r] ==  target) {
				return true;
			} 
			
			else if(nums[l] + nums[r] > target) {
				
				  r--;
				
			}else {
				l++;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
	
		int nums[] = {1,2,4,5,3,5,6};
		int target = 3;
		System.out.println(findTwo(nums, target));
	}
}
