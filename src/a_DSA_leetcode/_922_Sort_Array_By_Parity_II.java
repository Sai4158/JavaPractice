package a_DSA_leetcode;

public class _922_Sort_Array_By_Parity_II {
	
    public static int[] sortArrayByParityII(int[] nums) {
        
    	int n = nums.length;
    	int l = 0;
    	int r = 1;
    	
    	
    	while(l<n && r<n) {
    		
    		if(nums[l] % 2 ==0) {
    			l+=2;
    			}
    	
    		else if(nums[r]%2==1) {
    			r+=2;
    		}
    		
    		else {
    			int temp =  nums[l];
    			
    			nums[l] = nums[r];
    			nums[r] =  temp;
    			
    			l+=2;
    			r+=2;
    			
    		}
    	}
    	
    	return nums;
    	
    }
	
	public static void main(String[] args) {
		int nums[] = {4,2,5,7};
		
		System.out.println(sortArrayByParityII(nums));
	}
}
