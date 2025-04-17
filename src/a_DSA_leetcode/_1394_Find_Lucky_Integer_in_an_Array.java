package a_DSA_leetcode;

import java.util.HashMap;

public class _1394_Find_Lucky_Integer_in_an_Array {

	
    public static int findLucky(int[] arr) {
        
    	int n =  arr.length;
    	HashMap<Integer, Integer> hm =  new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < n; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
    	
    	
    	int ans = -1;
    	
    	for(int a : hm.keySet()) {
    		
    		if(a ==  hm.get(a)) {
    			ans = Math.max(a, ans);
    		}
    		
    	}
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		
		int arr[] = {2,2,3,4};
		System.out.println(findLucky(arr));
	}
}
