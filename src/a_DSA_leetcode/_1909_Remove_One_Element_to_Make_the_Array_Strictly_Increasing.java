package a_DSA_leetcode;

import java.util.concurrent.CountDownLatch;


public class _1909_Remove_One_Element_to_Make_the_Array_Strictly_Increasing {


    public static boolean canBeIncreasing(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                count++;
                if (count > 1) return false;

                if (i > 1 && nums[i] <= nums[i - 2]) {
                    if (i + 1 < n && nums[i + 1] <= nums[i - 1]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }


	public static void main(String[] args) {
		System.out.println(canBeIncreasing(new int[]{1, 2, 10, 5, 7}));
	}
}
