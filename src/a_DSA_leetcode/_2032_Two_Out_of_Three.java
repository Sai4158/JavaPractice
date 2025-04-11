package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class _2032_Two_Out_of_Three {

	public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

		HashMap<Integer, Integer> hm =  new HashMap<Integer, Integer>();

		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		HashSet<Integer> hs3 = new HashSet<Integer>();

		//    	Added the values into the set
        for (int val : nums1) {
            hs1.add(val);
        }

        for (int val : nums2) {
            hs2.add(val);
        }

        for (int val : nums3) {
            hs3.add(val);
        }


		//    	Now adding the values to the hashMap
        for (int val : hs1) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }

        for (int val : hs2) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }

        for (int val : hs3) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }


		//        Add values with count >= 2
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int key : hm.keySet()) {
            if (hm.get(key) >= 2) {
                ans.add(key);
            }
        }

        return ans;
    }

	public static void main(String[] args) {
		int[] nums1 = {1, 1, 3, 2};
		int[] nums2 = {2, 3};
		int[] nums3 = {3};
		System.out.println(twoOutOfThree(nums1, nums2, nums3)); 
	}
}
