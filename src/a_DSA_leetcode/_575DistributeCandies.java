package a_DSA_leetcode;

import java.util.HashSet;

public class _575DistributeCandies {

    public static int distributeCandies(int[] candyType) {
        
    	int n =  candyType.length;
    	
    	HashSet<Integer> hs = new HashSet<Integer>();
    	
    	for (int i = 0; i < n; i++) {
    		hs.add(candyType[i]);
		}
    	
    	return Math.min(hs.size(), n/2);
    	
    	
    }
    
    public static void main(String[] args) {
		
    	int candyType[] = {1,1,2,2,3,3};
    	System.out.println(distributeCandies(candyType));
	}
	
}
