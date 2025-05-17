package a_DSA_leetcode;

public class _3512_Minimum_Operations_to_Make_Array_Sum_Divisible_by_K {

    public static int minOperations(int[] nums, int k) {
        
    	int n =  nums.length;
    	
    	int total = 0;
    	
    	for (int i = 0; i <n; i++) {
    		total+= nums[i];
		}
    	
    	int reminder  =  total % k;
    	
    	if(reminder == 0) {
    		
    		return 0;
    	}
    	
    	return reminder;
    }
	
	public static void main(String[] args) {
		int nums[] = {3,9,7}, k = 5;
		System.out.println(minOperations(nums, k));
	}
}
