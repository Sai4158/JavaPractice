package a_DSA_leetcode;

public class _704_Binary_Search {
	
	public static  int search(int[] nums, int target) {
        int l = 0;
		int r = nums.length-1;
		
		
		while(l<=r) {
			int mid =  (l+r)/2;
			
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] > target) {
				r = mid -1;
			}else {
				l = mid +1;
			}
		}
		return -1;
    }

    
    
    public static void main(String[] args) {
		
    	int nums[] = {-1,0,3,5,9,12};
    	int target = 9;
    	
    	System.out.println(search(nums, target));
	}
    
    
}
