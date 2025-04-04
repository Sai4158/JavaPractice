package a_DSA_leetcode;

public class _1863_Sum_of_All_Subset_XOR_Totals {

    public static int subsetXORSum(int[] nums) {
        int total = 0;
        int n = nums.length;
        int subsets = (int)Math.pow(2, n); 

        for (int i = 0; i < subsets; i++) {
        	
            int xor = 0;
            
            for (int j = 0; j < n; j++) {

                int bit = (int)Math.pow(2, j);
                
                if ((i / bit) % 2 == 1) {
                    xor = xor ^ nums[j];
                }
                
            }
            
            total += xor;
        }

        return total;
    }


	public static void main(String[] args) {
		int[] nums = {5, 1, 6};
		System.out.println(subsetXORSum(nums)); 
	}
}
