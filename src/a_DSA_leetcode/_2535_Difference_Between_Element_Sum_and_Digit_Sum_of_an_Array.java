package a_DSA_leetcode;

public class _2535_Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {


	public static int differenceOfSum(int[] nums) {

		int n  =  nums.length;

		int count1 = 0;  	
		int count2 = 0;

		for (int i = 0; i < n; i++) {

			int NUM =  nums[i];

			while (NUM > 0) {
				count2 += NUM % 10; 
				NUM /= 10; 
			}
		}

		for (int i = 0; i < n; i++) {
			count1+=nums[i];
		}


		return Math.abs(count1 - count2);     	
	}

	public static void main(String[] args) {

		int nums[] = {1,15,6,3};

		System.out.println(differenceOfSum(nums));
	}
}
