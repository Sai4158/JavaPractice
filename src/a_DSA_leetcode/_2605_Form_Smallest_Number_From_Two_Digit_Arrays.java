package a_DSA_leetcode;

import java.util.Arrays;

public class _2605_Form_Smallest_Number_From_Two_Digit_Arrays {

	public static int minNumber(int[] nums1, int[] nums2) {

		Arrays.sort(nums1);
		Arrays.sort(nums2);


		for (int i = 0; i < nums2.length; i++) {


			for (int j = 0; j < nums2.length; j++) {


				if(nums1[i] ==  nums2[j]) {

					return nums1[i];
				}

			}

		}

		int a  =  nums1[0];
		int b  =  nums2[0];

		String ans3 = "";

		if(a < b) {
			return Integer.parseInt(Integer.toString(a) + Integer.toString(b));

		}else {
			return Integer.parseInt(Integer.toString(b) + Integer.toString(a));
		}


	}

	public static void main(String[] args) {
		int nums1[] = {4,1,3}, nums2[] = {5,7};
		System.out.println(minNumber(nums1, nums2));
	}
}
