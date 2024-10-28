package a_DSA_leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class _645_Set_Mismatch {
	public static int[] findErrorNums(int[] nums) {

		HashSet<Integer> hs = new HashSet<>();
		
		int dup = -1;
		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
						
			if(!hs.contains(current)) {
				hs.add(current);
			}else {
				dup = current;
			}
		}
		
		
		
		int missing =-1;
		for (int i = 1; i <= nums.length; i++) {
			if(!hs.contains(i)) {
				missing = i;
			}
		}
		
		
	
		int ans[] = {dup,missing};		
		
		return ans;
	}



	public static void main(String[] args) {
		int a[] =  {1,2,2,4};
				
		System.out.println(Arrays.toString(findErrorNums(a)));
	}
}
