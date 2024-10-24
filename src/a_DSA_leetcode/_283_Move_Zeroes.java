package a_DSA_leetcode;

import java.util.Arrays;

public class _283_Move_Zeroes {
	public static void moveZeroes(int[] nums) {
        
//		length 
		int n = nums.length;
		int newArr = 0;
		int zeroCounter = 0;
		
//		remove zeros and count them
		for (int i = 0; i < n; i++) {
			if(nums[i] != 0) {
				nums[newArr] =  nums[i];
				zeroCounter++;
			}
		}
		
//		start at index where counter left at
//		if 5 letters in a word so 2 letters have 0 so counter will be at 3 and then will run from 3 to 5 (word length)
		
		for (int i = zeroCounter; i < n; i++) {
//			Add zero at last
			nums[i]=0;
		}
		
		
    }
	
	public static void main(String[] args) {

		int arr[] = {0,3,0,3,0};
		
//		Load int fun
		moveZeroes(arr);

//		Print the arr
		System.out.println(Arrays.toString(arr));
		
	}
}
