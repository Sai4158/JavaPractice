package a_DSA_part_41_to_part_50;

public class Day35Recap {
	
	
	public static int atMostK(int[] nums, int k) {
		
		if(k<0) {
			return 0;
		}
		
		
		int l =0;
		int temp =0;
		int ans =0;
		int n = nums.length;
		
		for (int r = 0; r < n; r++) {
			
			temp+= nums[r];
			
			while(temp > k) {
				
				temp -= nums[l];
				
				l++;
			}
			
			ans += r - l + 1;  
			
		}
		return ans;
	  }
	
	
	  public static int numSubarraysWithSum(int[] nums, int goal) {
		  
		  
		  return atMostK(nums, goal) - atMostK(nums, goal-1);
	  }
	  
	  
	  
	  
	  
	  
	  
//	  main method 
	  
	  public static void main(String[] args) {
		  int nums[] = {1,0,1,0,1};
			int goal = 2;
		
		System.out.println(numSubarraysWithSum(nums, goal));
	}
}
