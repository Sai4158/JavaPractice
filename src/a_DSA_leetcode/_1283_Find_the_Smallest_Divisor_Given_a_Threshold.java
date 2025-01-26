package a_DSA_leetcode;

public class _1283_Find_the_Smallest_Divisor_Given_a_Threshold {


	public static int smallestDivisor(int[] nums, int threshold) {

		int l = 1; 
		int r = 10000;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (isPossible(nums, threshold, mid)) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return l;

	}

	public static boolean isPossible(int[] nums, int threshold, int k) {

		int sum =0;

		for (int i = 0; i < nums.length; i++) {
			
			sum += nums[i] / k;
			
			if(nums[i] % k != 0) {
				sum++;
			}


			if(sum > threshold) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		int  nums[] = {1,2,5,9};
		int threshold = 6;

		System.out.println(smallestDivisor(nums, threshold));
	}


}
