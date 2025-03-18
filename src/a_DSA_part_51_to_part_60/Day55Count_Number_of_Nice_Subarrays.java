package a_DSA_part_51_to_part_60;

import java.util.Iterator;

public class Day55Count_Number_of_Nice_Subarrays {

	public static int atMostK(int[] nums, int k) {

		int ans = 0;
		int temp = 0;
		int l = 0;

		for (int r = 0; r < nums.length; r++) {

			if(nums[r] % 2 == 1) {
				temp++;
			}

			while(temp>k) {
				if(nums[l] % 2 ==1) {
					temp--;
				}
				l++;
			}

			ans += r-l+1;
		}

		return ans;
	}


	public static int numberOfSubarrays(int[] nums, int k) {
		return atMostK(nums, k)  - atMostK(nums, k-1);
	}


	public static void main(String[] args) {

		int nums[] = {1,1,2,1,1};
		int k = 3;

		System.out.println(numberOfSubarrays(nums, k));

	}
}
