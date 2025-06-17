package a_DSA_leetcode;

public class _2574_Left_and_Right_Sum_Differences {
	
    public static int[] leftRightDifference(int[] nums) {
        
    	int n =  nums.length;
    	int ans[] = new int[n];
    	int total = 0;
    	int leftSum = 0;
    	
//    	Add all nums to total first
    	for (int i = 0; i < n; i++) {
			total += nums[i];
		}

    	
//    	then find the right and left sum here
    	for (int i = 0; i < n; i++) {
			
    		int rightSum = total - leftSum - nums[i];
    		
    		ans[i] =  Math.abs(leftSum-rightSum);
    		
    		leftSum += nums[i];
    		
		}
    	
    	return ans;
    	
    }
	
	public static void main(String[] args) {
		int nums[] =  {10,4,8,3};
		System.out.println(leftRightDifference(nums));
	}
}
