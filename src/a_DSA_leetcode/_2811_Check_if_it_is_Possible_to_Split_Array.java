package a_DSA_leetcode;

import java.util.List;

public class _2811_Check_if_it_is_Possible_to_Split_Array {

	public static boolean canSplitArray(List<Integer> nums, int m) {
		
		int n =  nums.size();

        if (n <= 2) {
            return true; 
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) + nums.get(i + 1) >= m) {
                return true;
            }
        }

        return false;
    }

	public static void main(String[] args) {
		int nums[] = {2, 2, 1}, m = 4;
		System.out.println(canSplitArray(nums, m));
	}
}
