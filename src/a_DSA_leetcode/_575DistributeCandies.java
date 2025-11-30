package a_DSA_leetcode;

import java.util.HashSet;

public class _575DistributeCandies {

    public static int distributeCandies(int[] candyType) {
        
    	int n =  candyType.length;
    	
//    	Hashset
    	HashSet<Integer> hs = new HashSet<Integer>();
    	
//    	Add all the candy types to the hashset
    	for (int i = 0; i < n; i++) {
    		hs.add(candyType[i]);
		}
    	
//    	return which ever is smaller if the size of the hashset or the array lenght
    	return Math.min(hs.size(), n/2);
    	
    	
    }
    
    public static void main(String[] args) {
		
    	int candyType[] = {1,1,2,2,3,3};
    	System.out.println(distributeCandies(candyType));
    	
    	int candyType1[] = {3,5,6,7,26,8,9};
    	System.out.println(distributeCandies(candyType1));
	}
	
}
