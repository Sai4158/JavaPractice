package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import arrayList_Vector_P46.Arraylist;

public class _2215_Find_the_Difference_of_Two_Arrays {


	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		HashSet<Integer>s1 = new HashSet<Integer>();
		HashSet<Integer>s2 = new HashSet<Integer>();

		for (int i = 0; i < nums1.length; i++) {

			s1.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			s2.add(nums2[i]);

		}


		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();


		for(Integer key : s1) {
			if(!s2.contains(key)) {
				l1.add(key);
			}
		}

		for(Integer key : s2) {
			if(!s1.contains(key)) {
				l2.add(key);
			}
		}

		ArrayList<List<Integer>> ans = new ArrayList<>();


		ans.add(l1);
		ans.add(l2);

		return ans;
	}

	public static void main(String[] args) {

		int nums1[] = {1,2,3}, nums2[] = {2,4,6};
		System.out.println(findDifference(nums1, nums2));
	}
}
