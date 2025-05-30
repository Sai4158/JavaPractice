package a_DSA_leetcode;

public class _2997_Minimum_Number_of_Operations_to_Make_Array_XOR_Equal_to_K {

    public static int minOperations(int[] nums, int k) {
        
		int xor = 0;

    	for (int i = 0; i < nums.length; i++) {
			    		
    		xor ^= nums[i];
  
		}
    	
    	
    	int diff =  xor ^ k;
    	
    	
    	return Integer.bitCount(diff);
    	
    }
	
	public static void main(String[] args) {
		int nums[] = {2,1,3,4}, k = 1;
		System.out.println(minOperations(nums, k));
	}
}
