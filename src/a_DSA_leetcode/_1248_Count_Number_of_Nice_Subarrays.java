package a_DSA_leetcode;

public class _1248_Count_Number_of_Nice_Subarrays {

	 private static int atMostK(int[] nums, int k) {
		 
		int n =  nums.length;
		int  l = 0;
		int ans = 0 ;
		int temp = 0;
		
		
		for (int r = 0; r < n; r++) {
			
			if(nums[r] % 2 == 1) {
				temp++;
			}
			
			 while (temp > k) {
	                if (nums[l] % 2 == 1) {
	                    temp--;
	                }
	                l++;
	            }
			 
			 ans += r-l+1;
			
		}
		
		return ans;
	}
	
	
    public static int numberOfSubarrays1(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    } 
	
    
	//Main
	public static void main(String[] args) {
		
		int nums[] = {1,1,2,1,1};
		int k = 3;
		
		System.out.println(numberOfSubarrays1(nums, k));

	}
}
