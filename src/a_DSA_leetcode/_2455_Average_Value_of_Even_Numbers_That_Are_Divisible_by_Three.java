package a_DSA_leetcode;

public class _2455_Average_Value_of_Even_Numbers_That_Are_Divisible_by_Three {

    public static int averageValue(int[] nums) {
        
    	int n = nums.length;
    	int count = 0;
    	int total = 0;
    	
    	for (int i = 0; i < n; i++) {
    		if(nums[i] % 3 == 0 && nums[i] % 2 == 0) {
    			total += nums[i];
    			count++;
    		}
    	}
    	
    	if(count == 0) {
    		return 0;
    	}
    	
    	return total / count;
    }
	
	public static void main(String[] args) {
		int nums[] = {1,3,6,10,12,15};
		
		System.out.println(averageValue(nums));
	}
}
