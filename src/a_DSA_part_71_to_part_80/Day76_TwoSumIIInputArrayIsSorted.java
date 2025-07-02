package a_DSA_part_71_to_part_80;

import aa_prac1.Nums;

public class Day76_TwoSumIIInputArrayIsSorted {
	
    public static int[] twoSum(int[] numbers, int target) {
    
    	int n  = numbers.length;
    	
    	int  l = 0;
    	int r = n - 1; 
    	int ans[] =  new int[2];
    	
    	while(l < r) {
    		
    		int sum =  numbers[l] +  numbers[r];
    		
    		if(sum ==  target) {
    			
    			return new int[] {l+1,r+2};
    		}
    		
    		if(sum <  target) {
    			
    			l++;
    			
    		}else {
    			r--;
    		}
    		
    	}
    	return new int[0];
    	
    }
	
	
	public static void main(String[] args) {
	
	int	numbers[] = {2,7,11,15}, target = 9;
		System.out.println(twoSum(numbers, target));
	}
}
