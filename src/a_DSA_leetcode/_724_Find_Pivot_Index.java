package a_DSA_leetcode;

public class _724_Find_Pivot_Index {
    
	public static int pivotIndex(int[] nums) {
        
		int n =  nums.length;
		
		for (int i = 0; i < n; i++) {
			
			int left = 0;
			int rigth = 0;
			
			for (int j = 0; j < i; j++) {
				left += nums[j];
			}
			
			
			for (int j = i+1; j < n; j++) {
				rigth += nums[j];
			}
			
			if(left == rigth) {
				return i;
			}
		}
		
        return -1;
		
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {1,7,3,6,5,6};
    			
    	System.out.println(pivotIndex(nums));
	}
}
