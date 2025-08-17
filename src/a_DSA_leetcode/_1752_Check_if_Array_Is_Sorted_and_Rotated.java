package a_DSA_leetcode;

public class _1752_Check_if_Array_Is_Sorted_and_Rotated {

    public static boolean check(int[] nums) {
        
    	int n = nums.length;
    	int count = 0;
    	
//    	Forloop
    	for (int i = 0; i < n-1; i++) {
			
//    		Count them
    		if(nums[i] >  nums[i+1]) {
    			count++;
    		}
    		
		}
    	
//    	Checking if
    	if(nums[n-1] > nums[0]) {
    		count++;
    	}
    	
//    	Return
    	return count <= 1;
    	
    }
    
    public static void main(String[] args) {
		int nums[] = {3,4,5,1,2};
		System.out.println(check(nums));
	}
}
