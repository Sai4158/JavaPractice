package a_DSA_leetcode;

import arrayList_Vector_P46.List;

public class _2824_Count_Pairs_Whose_Sum_is_Less_than_Target {


	public static int countPairs(List<Integer> nums, int target) {

		int l = 0;
		int count = 0;
		int n = nums.size();

        for (int i = 0; i < n; i++) {
			
        	for (int j = i+1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target) {
					count++;
				}
			}
		}
        return count;
	}

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 4, 5};
		int target1 = 8;
		System.out.println(countPairs(nums1, target1));
	}
}
