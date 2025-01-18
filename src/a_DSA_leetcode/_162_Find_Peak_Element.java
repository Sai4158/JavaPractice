package a_DSA_leetcode;

public class _162_Find_Peak_Element {
	
    public static int findPeakElement(int[] nums) {
        
    	int l = 0;
    	int r = nums.length -1;
    	
    	while(l<r) {
    		 int mid =  l + (r-l)/2;
    		 
    		 if(nums[mid] > nums[mid+1]) {
    			 r =  mid;
    		 }else {
    			 l = mid + 1;
    		 }
    	}
    	return l;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,1};
		
		System.out.println(findPeakElement(nums));
	}
}
