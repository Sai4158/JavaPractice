package a_DSA_leetcode;

public class _912_Sort_an_Array {
	public static int[] sortArray(int[] nums) {

		int n =  nums.length;
		int ans[] =  new int[n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n-i-1; j++) {
				if(nums[j]>nums[j+1]){
					int temp =  nums[j];

					nums[j] = nums[j+1];
					nums[j+1] = temp; 

				}

			}
		}

		return nums;

	}

	public static void main(String[] args) {
		int arr[] = {3,4,5,6,6,5};
 		System.out.println(sortArray(arr));
	}
}
