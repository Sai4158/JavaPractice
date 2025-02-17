package a_DSA_leetcode;

public class _643_Maximum_Average_Subarray_I {
	
    public static  double findMaxAverage(int[] nums, int k) {
        
    	int l =0;
    	int n =  nums.length;
    	int temp = 0;
    	double ans = Integer.MIN_VALUE;
    	
    	
    	for (int r = 0; r < n; r++) {
			
    	temp += nums[r];
    	
    	if(r-l+1 > k) {
    		temp -= nums[l];
    		
    		l++;
    	}
    	
    	if(r-l+1 == k) {
    		ans = Math.max(ans, temp);
    	}
    	
    	}
    	 return ans / k;
    }
	
	public static void main(String[] args) {
		int  nums[] = {1,12,-5,-6,50,3}, k = 4;
		System.out.println(findMaxAverage(nums, k));
	}
}
