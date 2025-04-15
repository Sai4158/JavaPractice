package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _2951_Find_the_Peaks {
	
	
    public static List<Integer> findPeaks(int[] mountain) {
        
    	List<Integer> ans = new ArrayList<>();
    	
        for (int i = 1; i < mountain.length - 1; i++) {
			

            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                ans.add(i);
            }
    		
		}
    	
    	return ans;
    }
    
    
    
	public static void main(String[] args) {
		
		int mountain[] = {2,4,4};
		System.out.println(findPeaks(mountain));
		
	}
	
}
