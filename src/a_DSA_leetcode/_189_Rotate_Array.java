package a_DSA_leetcode;

import java.util.ArrayList;

public class _189_Rotate_Array {
	
    public static void rotate(int[] nums, int k) {
        
    	int n = nums.length;
        k = k % n; 
        ArrayList<Integer> a1 = new ArrayList<>();

        for (int i = n - k; i < n; i++) {
            a1.add(nums[i]);
        }

        for (int i = 0; i < n - k; i++) {
            a1.add(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = a1.get(i);
        }
    	
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {1,2,3,4,5,6,7};
    	int k = 3;
    	
    	System.out.println(rotate(nums, k));
	}
}
