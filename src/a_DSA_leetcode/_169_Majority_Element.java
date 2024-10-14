package a_DSA_leetcode;

public class _169_Majority_Element {
	 public static int majorityElement(int[] nums) {
	        int n = nums.length;

	        for (int i = 0; i < n; i++) {
	            int count = 0;
	            for (int j = 0; j < n; j++) {
	                if (nums[j] == nums[i]) {
	                    count++;  
	                }
	            }
	            
	            if (count > n / 2) {
	                return nums[i];
	            }
	        }

	        return -1;  
	    }
	 
	 public static void main(String[] args) {
		int a[] = {2,3,3};
		
		
		System.out.println(majorityElement(a));
	}
}
