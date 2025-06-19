package a_DSA_leetcode;

import java.util.Stack;


public class _456_132_Pattern {

	public static boolean find132pattern(int[] nums) {

		int n =  nums.length;
		int third =  Integer.MIN_VALUE;
		Stack<Integer> stack = new Stack<Integer>();
		
	    for (int i = n - 1; i >= 0; i--) {
			
			if(nums[i] < third) {
				return true;
			}
			
			
			while(!stack.isEmpty() && nums[i] > stack.peek()) {
				third = stack.pop();
			}
			
			stack.push(nums[i]);
			
		}
		
		return false;

	}

	public static void main(String[] args) {
		int[] nums = {3, 1, 4, 2};
		System.out.println(find132pattern(nums));
	}
}
