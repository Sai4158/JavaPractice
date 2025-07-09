package a_DSA_leetcode;

import java.util.LinkedList;
import java.util.List;

public class _2855_Minimum_Right_Shifts_to_Sort_the_Array {
	
    public static int minimumRightShifts(List<Integer> nums) {
        
    	int n = nums.size();
    	int drop = -1;
    	
    	for (int i = 1; i < n; i++) {
			
    		if(nums.get(i) < nums.get(i-1)) {
    			
    			if(drop != -1 )return -1;
    			drop = i;
    		}
    		
		}
    	
    	if(drop == -1) return 0;
    	if(nums.get(n - 1) > nums.get(0)) return -1;
    	
    	return n -  drop;
    	
    }
	
	public static void main(String[] args) {
		List<Integer> nums = new LinkedList<Integer>();
		
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(1);
		nums.add(2);
		
		System.out.println(minimumRightShifts(nums));
	}
}
