package a_DSA_leetcode;

public class _33_Search_in_Rotated_Sorted_Array {

	public static  int search(int[] nums, int target) {

		int l = 0;
		int n = nums.length;
		int r =  n - 1;

		while(l <= r) {

			int mid = l + (r-l)/2;

			if(nums[mid] == target) {
				return mid;
			} 

			if (nums[l] <= nums[mid]) {
				if (nums[l] <= target && target < nums[mid]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			} 

			else {
				if (nums[mid] < target && target <= nums[r]) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = {4,5,6,7,0,1,2};
		int target =  0;

		System.out.println(search(nums, target));
	}
}
