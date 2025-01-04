package a_DSA_leetcode;

public class _930_Binary_Subarrays_With_Sum {
	
	
	  public static int atmostK(int[] nums, int k) {
	        
		  int l = 0;
		  int temp = 0;
		  int ans = 0;
		  
		  if(k<0) {
			  return 0;
		  }
		  
		  for (int i = 0; i < nums.length; i++) {
			
			  temp += nums[i];
			  
			  while(temp > k) {
				  
				  temp -= nums[l]; 
						  
				  l++;
			  }
			  
			  ans +=  i-l+1;

		  }
		  return ans;
		  
	    }
	
	  public static int numSubarraysWithSum(int[] nums, int goal) {
		  return atmostK(nums, goal) -  atmostK(nums,goal-1);
	    }
	  
	
	
	
	public static void main(String[] args) {
		
		int nums[] = {1,0,1,0,1};
		int goal = 2;
		
		System.out.println(numSubarraysWithSum(nums, goal));
		
	}
}
