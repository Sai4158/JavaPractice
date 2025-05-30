package a_DSA_leetcode;

public class _2997_Minimum_Number_of_Operations_to_Make_Array_XOR_Equal_to_K {

    public static int minOperations(int[] nums, int k) {
        
//    	set to 0
		int xor = 0;

		
    	for (int i = 0; i < nums.length; i++) {
		
//    		XOR all the array values 
    		xor ^= nums[i];
  
		}
    
    	
//    	find the diffrence between the XOR and k
    	int diff =  xor ^ k;
    	
    	
//    	Count all the ones after converting using bitcount
    	return Integer.bitCount(diff);
    	
    }
	
	public static void main(String[] args) {
		int nums[] = {2,1,3,4}, k = 1;
		System.out.println(minOperations(nums, k));
	}
}
