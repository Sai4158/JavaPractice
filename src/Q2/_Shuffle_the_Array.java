package Q2;

import java.util.Arrays;

public class _Shuffle_the_Array {

	 public static int[] shuffle(int[] nums, int n) {

	        int len = nums.length;
	        int ans1[] = new int[len / 2]; 
	        int ans2[] = new int[len / 2]; 
	        int ans[] = new int[len];      

	        for (int i = 0; i < n; i++) {
	            ans1[i] = nums[i];       
	            ans2[i] = nums[n + i];   
	        }

	        int j = 0; 
	        
	        for (int i = 0; i < len; i++) {
	        	
	            if (i % 2 == 0) {
	                ans[i] = ans1[j];
	            } 
	            
	            else {
	                ans[i] = ans2[j];
	                j++; 
	            }
	        }

	        return ans;
	    }
	
    
    public static void main(String[] args) {
		int nums[] = {2,5,1,3,4,7}, n = 3;
		
        System.out.println(Arrays.toString(shuffle(nums, n)));
	}
}
