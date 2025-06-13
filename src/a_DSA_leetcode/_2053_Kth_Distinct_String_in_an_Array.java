package a_DSA_leetcode;

import java.util.HashMap;

public class _2053_Kth_Distinct_String_in_an_Array {
	
    public static String kthDistinct(String[] arr, int k) {
        
    	int n = arr.length;
    	HashMap<String, Integer> hm = new HashMap<String, Integer>();
    	
//    	add them to the the HashMap and the count them 
    	for (int i = 0; i < n; i++) {			
    		hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
    	
    	
    	int count = 0;
    	
    	
//    	get the value based of k
    	for (int i = 0; i < n; i++) {
			
    		if(hm.get(arr[i]) ==  1) {
    			
    			count++;
    			
    			if(count == k) {
    				return arr[i];
    			}
    		}
    		
		}
    	
    	return "";
    }
	
	public static void main(String[] args) {
		
		String arr[] = {"d","b","c","b","c","a"};
		int k = 2;
		System.out.println(kthDistinct(arr, k));
	}
}
