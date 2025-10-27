package a_DSA_leetcode;

public class _75_SortColors {

    public static void sortColors(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    
    	    	
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {5,4,41,1,1,4};
    	System.out.println(sortColors(nums));
    }
	
}
