package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

import ist_prac.Arrays;

public class _2859_Sum_of_Values_at_Indices_With_K_Set_Bits {

	
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
    	int ans = 0;
    	int n =  nums.size();
    	
    	for (int i = 0; i < n; i++) {
			if(nums.get(i).bitCount(i) == k) {
				ans += nums.get(i);
			}
		}
    	
    	return ans;
    	
    }
	
	public static void main(String[] args) {
		
		int  k = 1;
		List<Integer> nums =  new ArrayList<Integer>();
		
		nums.add(5);
		nums.add(10);
		nums.add(1);
		nums.add(5);
		nums.add(2);
		
		System.out.println(sumIndicesWithKSetBits(nums, k));
	}
	
	
}
