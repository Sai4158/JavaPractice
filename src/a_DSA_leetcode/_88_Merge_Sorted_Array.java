package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _88_Merge_Sorted_Array {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		ArrayList<Integer> al1 = new ArrayList<Integer>();

	    // Add first m elements of nums1
        for (int i = 0; i < m; i++) {
            al1.add(nums1[i]);
        }

        // Add first n elements of nums2
        for (int i = 0; i < n; i++) {
            al1.add(nums2[i]);
        }
        
        Collections.sort(al1);
        
        
        for (int i = 0; i < al1.size(); i++) {
			nums1[i] = al1.get(i);
		}
		
		System.out.println(al1);
		
	}

	public static void main(String[] args) {
		
		int nums1[] = {1,2,3,0,0,0}, m = 3, nums2[] = {2,5,6}, n = 3;
		
		merge(nums1, m, nums2, n);
	}
}
