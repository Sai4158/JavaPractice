package a_DSA_leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class _2418_Sort_the_People {

	 public static  String[] sortPeople(String[] names, int[] heights) {
	        
	        int n = names.length;
	        
//	        2d array
	        String sortedNames[] = new String[n];

	        
	        HashMap<Integer, String> heightToNameMap = new HashMap<>();

	        for(int i = 0; i < n; i++) {
	            heightToNameMap.put(heights[i], names[i]);
	        }

//	        Sort it
	        Arrays.sort(heights);

//	        Return the order in reverse
	        for(int i = n - 1; i >= 0; i--) {
	            sortedNames[n - i - 1] = heightToNameMap.get(heights[i]);
	        }
	        return sortedNames;

	    }
	 
	 public static void main(String[] args) {
		 
		 String names[] = {"Mary","John","Emma"};
		 int nums[] = {180,165,170};
		System.out.println(sortPeople(names, nums));
	}
	
}
