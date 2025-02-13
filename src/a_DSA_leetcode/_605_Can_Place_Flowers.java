package a_DSA_leetcode;

import java.util.Iterator;

public class _605_Can_Place_Flowers {
	
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        
    	
    	int len = flowerbed.length;
    	int zerocount = 1;
    	int possibleFlowers = 0;
    	
    	
    	for (int i = 0; i < len; i++) {
			
    		if(flowerbed[i] == 0) {
    			zerocount++;
    		}else {
    			possibleFlowers += (zerocount -1)/2;
    			zerocount = 0;
    		}
   
		}
    	
    	possibleFlowers += zerocount/2;
    	
    	return possibleFlowers >= n;
    }
	
	public static void main(String[] args) {
		int flowerbed[] = {1,0,0,0,1}, n = 1;
		
		System.out.println(canPlaceFlowers(flowerbed, n));
	}
}
