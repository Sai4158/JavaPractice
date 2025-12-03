package a_DSA_leetcode;

import java.util.Arrays;
import java.util.Iterator;

public class _274_H_Index_1 {

	
    public static int hIndex(int[] citations) {
        
    	int n = citations.length;
    	
//    	O(N LOG N)
    	Arrays.sort(citations);
    	
//    	0(N)
    	for (int i = 0; i < n; i++) {
			
    		int count =  n - i;
    		
    		
    		if(citations[i] >= count) {
    			return count;
    		}
		}
    	
    	return 0;
    	
    }
    
    public static void main(String[] args) {
		
    	int citations[] = {3,0,6,1,5};
    	System.out.println(hIndex(citations));
    	    	
    	int citations1[] = {1,3,1};
    	System.out.println(hIndex(citations1));
	}
}
