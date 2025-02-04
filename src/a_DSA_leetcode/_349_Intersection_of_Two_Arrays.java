package a_DSA_leetcode;

import java.sql.ResultSet;
import java.util.HashSet;

public class _349_Intersection_of_Two_Arrays {
	
	
    public static int[] intersection(int[] nums1, int[] nums2) {
        
    	HashSet<Integer> hs =  new HashSet<Integer>();
    	HashSet<Integer> ans =  new HashSet<Integer>();
    	
    	for (int i = 0; i < nums1.length; i++) {
			hs.add(nums1[i]);
		}
    	
    	for (int i = 0; i < nums2.length; i++) {
    		
    		if(hs.contains(nums2[i])) {
    			ans.add(nums2[i]);
    		}
    		
		}
    	
    	//converting to list 
    	
        int[] result = new int[ans.size()];
        int c =0;
        
        for(int a : ans) {
        	result[c++] = a;
        }
        
        return result;
    	
    }
	
	public static void main(String[] args) {
		
		int nums1[] = {1,2,2,1}, nums2[] = {2,2};
		System.out.println(intersection(nums1, nums2));
		
	}
}
