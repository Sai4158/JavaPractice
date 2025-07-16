package a_DSA_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class _506_Relative_Ranks {
	
    public static String[] findRelativeRanks(int[] score) {
        
    	int n = score.length;
    	HashMap<Integer, String> hm = new HashMap<Integer, String>();
    	
    	int ans[] = score.clone();
    	Arrays.sort(ans);
    	
    	String result[] = new String[n];
    	
//    	Added all to hash map
    	for (int i = 0; i < n; i++) {
		
    		int rank =  n - i;
    		
    		if(rank == 1) {
    			hm.put(ans[i], "Gold Medal");
    		}else  if(rank == 2) {
    			hm.put(ans[i], "Silver Medal");
    		}else if(rank == 3) {
    			hm.put(ans[i], "Bronze Medal");
    		}
    		
    		else {
    			hm.put(ans[i], String.valueOf(rank));
    		}
		}
    	
    	//Adding all to result from hash map
    	
    	for (int i = 0; i < n; i++) {
			
    		result[i] = hm.get(score[i]);
    		
		}
    	
    	
    	return result;
    }
	
	public static void main(String[] args) {
		int  score[] = {5,4,3,2,1};
		System.out.println(findRelativeRanks(score));
	}
}
