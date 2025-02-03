package a_DSA_leetcode;

public class _1588_Sum_of_All_Odd_Length_Subarrays {
	
    public static int sumOddLengthSubarrays(int[] arr) {
        
    	
    	int n = arr.length;
    	int l = 0;
    	int temp =0;
    	int ans = 0;
    	int k = 0;
    	
    	for (int r = 0; r < n; r++) {
			
    		if(arr[r] % 2 == 1) {
    			ans++;
    		}
    		
    		while(temp > k) {
    			if(arr[l] % 2 ==1) {
					temp--;
				}
    			l++;
    		}
    		
    		ans =  Math.max(ans, r-l+1);
		}
    	return ans;
    }
	
	public static void main(String[] args) {
		int arr[] = {1,4,2,5,3};
		System.out.println(sumOddLengthSubarrays(arr));
	}
}
