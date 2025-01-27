package a_DSA_leetcode;

import java.util.ArrayList;

public class _4_Median_of_Two_Sorted_Arrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int n1 = nums1.length;
		int n2 = nums2.length;
		int total = n1 + n2;

		ArrayList<Integer> merged = new ArrayList<>();

		for (int i = 0; i < n1; i++) {
			merged.add(nums1[i]);
		}
		for (int i = 0; i < n2; i++) {
			merged.add(nums2[i]);
		}

		// Sort the merged array
		merged.sort(null);

		// Find the median
		if (total % 2 == 1) {
			return merged.get(total / 2); 
		} else {
			int mid1 = merged.get(total / 2 - 1);
			int mid2 = merged.get(total / 2);
			return (mid1 + mid2) / 2.0; 	
		}
	}

	public static void main(String[] args) {

		int nums1[] = {1,3}, nums2[] = {2};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
