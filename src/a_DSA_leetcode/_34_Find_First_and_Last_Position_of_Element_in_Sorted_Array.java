package a_DSA_leetcode;

public class _34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
	
//	This is left most
	public static int leftMost(int nums[], int target) {

		int l = 0;
		int r =  nums.length - 1;
		int result = -1;

		while(l <= r) {
			int mid =  l + (r-l)/2;

			if(nums[mid] == target) {

				result = mid;

				r =  mid - 1;
			}else if(nums[mid]>target) {
				r = mid-1;
			}else {
				l = mid +1;
			}
		}
		return result;

	}

//	This is the right most 
	public static int RightMost(int nums[], int target) {

		int l = 0;
		int r =  nums.length - 1;
		int result = -1;

		while(l <= r) {
			int mid =  l + (r-l)/2;

			if(nums[mid] == target) {

				result = mid;

				l =  mid + 1;
			}else if(nums[mid]>target) {
				r = mid-1;
			}else {
				l = mid +1;
			}
		}
		return result;

	}

	public static int[] searchRange(int[] nums, int target) {

		int a[] = {leftMost(nums, target), RightMost(nums, target)};
		
        return a;

	}

	public static void main(String[] args) {
		int nums[] = {5,7,7,8,8,10};
		int target = 8;

		System.out.println(searchRange(nums, target));
	}
}
