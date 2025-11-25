package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _228_Summary_Ranges {

	public static List<String> summaryRanges(int[] nums) {

		int n = nums.length;

		Arrays.sort(nums);

		String test =  "->";

		List<String> ans = new ArrayList<String>();

		if(n==0)return ans;

		int start = nums[0];

		for (int i = 1; i <= n; i++) {


			if(i==n || nums[i] !=  nums[i-1] + 1) {

				int end =  nums[i-1];


				if(start == end) {
					ans.add(String.valueOf(start));    			}



				else {

					ans.add(start + test + end);

				}
				
				if(i < n ) {
					start = nums[i];
				}

			}

		}
		
		return ans;

	}

	public static void main(String[] args) {

		int []nums = {0,1,2,4,5,7};

		System.out.println(summaryRanges(nums));
		
		
		int []nums1 = {0,2,3,4,6,8,9};

		System.out.println(summaryRanges(nums1));
		
	}
}
