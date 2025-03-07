package a_DSA_leetcode;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
	
	
    public static int findNumbers(int[] nums) {
        
    	int n =  nums.length;
    	int count = 0;
    	
    	for (int i = 0; i < n; i++) {
    		if(String.valueOf(nums[i]).length() % 2 ==0) {
    			count++;
    		}
		}
    	return count;
    }
	
	public static void main(String[] args) {
		int nums[] = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
	}
}
