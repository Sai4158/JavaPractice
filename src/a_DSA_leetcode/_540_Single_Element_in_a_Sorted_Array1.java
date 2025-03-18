package a_DSA_leetcode;

public class _540_Single_Element_in_a_Sorted_Array1 {

	public static int singleNonDuplicate(int[] nums) {

		int i = 0;

		while(i < nums.length-1) {
			
			if(nums[i] !=  nums[i+1]) {
				return nums[i];
			}
			
			i += 2;
			
		}

		return nums[nums.length-1];

	}

	public static void main(String[] args) {
		int nums1[] = {1,1,2,3,3,4,4,8,8};
		int nums2[] = {3,3,7,7,10,11,11};

		System.out.println(singleNonDuplicate(nums1)); 
		System.out.println(singleNonDuplicate(nums2));
	}
}
