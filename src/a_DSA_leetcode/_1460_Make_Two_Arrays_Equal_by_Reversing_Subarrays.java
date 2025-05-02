package a_DSA_leetcode;

import java.util.Arrays;

public class _1460_Make_Two_Arrays_Equal_by_Reversing_Subarrays {
	
    public static boolean canBeEqual(int[] target, int[] arr) {
        
    	Arrays.sort(target);
    	Arrays.sort(arr);
    	
    	return Arrays.equals(target, arr);
    	
    }
	
	public static void main(String[] args) {
		int target[] = {1,2,3,4}, arr[] = {2,4,1,3};
		System.out.println(canBeEqual(target, arr));
	}
}
