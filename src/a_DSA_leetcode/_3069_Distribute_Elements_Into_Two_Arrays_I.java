package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _3069_Distribute_Elements_Into_Two_Arrays_I {

	    public static int[] resultArray(int[] nums) {

	        List<Integer> arr1 = new ArrayList<>();
	        List<Integer> arr2 = new ArrayList<>();

	        arr1.add(nums[0]);
	        arr2.add(nums[1]);

	        for (int i = 2; i < nums.length; i++) {
	            int last1 = arr1.get(arr1.size() - 1);
	            int last2 = arr2.get(arr2.size() - 1);

	            if (last1 > last2) {
	                arr1.add(nums[i]);
	            } else {
	                arr2.add(nums[i]);
	            }
	        }

	        arr1.addAll(arr2);

	        int[] ans = new int[arr1.size()];
	        for (int i = 0; i < arr1.size(); i++) {
	            ans[i] = arr1.get(i);
	        }

	        return ans;
	    }
	
	
	public static void main(String[] args) {
		int[] nums = {5, 4, 3, 8};
		System.out.println(resultArray(nums));
	}
}
