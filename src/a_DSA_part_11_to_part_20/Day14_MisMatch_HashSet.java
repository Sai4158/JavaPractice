package a_DSA_part_11_to_part_20;

import java.util.Arrays;
import java.util.HashSet;

public class Day14_MisMatch_HashSet {
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
		for (int i = 0; i < nums.length; i++) {
			if(!hs.contains(i)) {
				missing = i;
			}
		}
		
		
	
		int ans[] = {dup,missing};		
		
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,2,4};
		
		
		System.out.println(Arrays.toString(findErrorNums(arr)));
	}
}
