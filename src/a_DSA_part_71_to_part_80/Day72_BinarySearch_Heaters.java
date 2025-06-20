package a_DSA_part_71_to_part_80;

import java.util.Arrays;

public class Day72_BinarySearch_Heaters {

    public static int findRadius(int[] houses, int[] heaters) {
    
    	int n =  houses.length;
    	Arrays.sort(houses);
    	Arrays.sort(heaters);
    	
    	int count = 0;
    	
    	for (int i = 0; i < n; i++) {
		
    		int l = 0;
    		int r = heaters.length - 1;
    		
    		int house =  houses[i];
    		int minDist = Integer.MAX_VALUE;
    		
    		while(l<=r) {
    			
    			int mid =  l + (r-l)/2;
    			
    			int heater =  heaters[mid];
    			int diff =  Math.abs(heater -  house);
    			minDist =  Math.min(minDist, diff);
    			
    			
    			if(heater < house) {
    				l = mid + 1;
    			}
    			
    			else {
    				r =  mid - 1;
    			}
    			
    		}
    		
    		count =  Math.max(count, minDist);
		}
    	
    	return count;
    }
	
	public static void main(String[] args) {
		int houses[] = {1,2,3}, heaters[] = {2};
		System.out.println(findRadius(houses, heaters));
	}
}
