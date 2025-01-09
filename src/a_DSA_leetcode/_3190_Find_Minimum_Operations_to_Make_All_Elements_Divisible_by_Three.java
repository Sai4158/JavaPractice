package a_DSA_leetcode;

public class _3190_Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three {
	
    public static int minimumOperations(int[] nums) {
        
    	int count = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
			
    		int a = nums[i] % 3;
    		
    		if(a != 0) {
    			count += Math.min(a,3 - a);
    		}
    		
		}
    	
    	return count;
    }
    
    
    
    public static void main(String[] args) {
    	 int[] nums1 = {2, 4, 3, 6};
         System.out.println(minimumOperations(nums1));
		
	}
}
