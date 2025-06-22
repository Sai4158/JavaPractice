package a_DSA_leetcode;

public class _485_Max_Consecutive_Ones {
    
	
	public static int findMaxConsecutiveOnes(int[] nums) {
        
		int n = nums.length;
		int count = 0;
		int ones  = 0;
		
		for (int i = 0; i < n; i++) {
			
			if(nums[i] == 1) {
				ones++;
				count =  Math.max(count, ones);
			}
			
			else {
				ones = 0;
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		int nums[] = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
}
