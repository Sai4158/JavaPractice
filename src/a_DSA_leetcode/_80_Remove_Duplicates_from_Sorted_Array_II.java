package a_DSA_leetcode;

public class _80_Remove_Duplicates_from_Sorted_Array_II {

    public static int removeDuplicates(int[] nums) {
        
    	int n =  nums.length;
    	
    	if(n <= 2)return n;
    	
    	int first = 2;
    	
    	for (int i = 2; i < n; i++) {
			
    		if(nums[i] != nums[first-2]) {
    			nums[first]  = nums[i];
    			first++;
    			
    		}
    		
		}
    	return first;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(nums));
	}
}
