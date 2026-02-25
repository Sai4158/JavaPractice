package a_DSA_leetcode;

public class _Set_Mismatch_ {
   
	
	public static int[] findErrorNums(int[] nums) {
		
		int n =  nums.length;
		int ans[] =  new int[2];
		int freq[] =  new int[n+1];

		
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        
		for (int i = 1; i <= n; i++) {
			
			if(freq[i] == 2) {
				
				ans[0] = i;				
			}else if(freq[i] == 0){
				ans[1] = i;

			}
			
		}
		
        return ans;
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {1,2,2,4};
    	System.out.println(findErrorNums(nums));
    	
	}
}
