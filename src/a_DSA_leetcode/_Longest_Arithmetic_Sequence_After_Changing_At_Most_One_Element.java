package a_DSA_leetcode;

public class _Longest_Arithmetic_Sequence_After_Changing_At_Most_One_Element {

	
    public static int longestArithmetic(int[] nums) {
     
    	 int n = nums.length;
         int maxLen = 2;

         for (int i = 0; i < n - 1; i++) {
             int d = nums[i + 1] - nums[i];
             int len = 2;
             boolean usedChange = false;

             for (int j = i + 2; j < n; j++) {
                 int currDiff = nums[j] - nums[j - 1];

                 if (currDiff == d) {
                     len++;
                 } else {
                     if (!usedChange) {
                         usedChange = true;
                         len++; 
                     } else {
                         break;
                     }
                 }
             }

             maxLen = Math.max(maxLen, len);
         }

         return maxLen;
    	
    }
    
    
    public static void main(String[] args) {
		
    	int nums[] = {9,7,5,10,1};
    	
    	System.out.println(longestArithmetic(nums));
    	
	}
}
