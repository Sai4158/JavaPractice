package a_DSA_leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class _1207_Unique_Number_of_Occurrences {
	
    public static boolean uniqueOccurrences(int[] arr) {
        
    	HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
    	HashSet<Integer> hs = new HashSet<Integer>();
    	
    	for (int i = 0; i < arr.length; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
    	
//    	add values to Hashset
    	
    	hs.addAll(HM.values());
    	
    	return HM.size() == hs.size();
    }
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 2, 1, 1, 3}; 
		
		System.out.println(uniqueOccurrences(arr1));
	}
}
