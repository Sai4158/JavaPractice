package a_DSA_leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class _645_Set_Mismatch {
	public static int[] findErrorNums(int[] nums) {


		HashSet<Integer> h1 = new HashSet<Integer>();
		
		int r = -1;
		
		for (int i = 0; i < nums.length; i++) {
			
			if(!h1.contains(nums[i])) {
				h1.add(nums[i]);
			}else {
				r = i;
			}
		}
		
		
		int count = 0;
		
		for (int i = 1; i < nums.length+1; i++) {
			 if(!h1.contains(i)) {
				 count = i;
				 break;
			 }
		}
		
		return new int[] {r,count};

	}



	public static void main(String[] args) {
		int a[] =  {1,2,2,4};
				
		System.out.println(Arrays.toString(findErrorNums(a)));
	}
}
