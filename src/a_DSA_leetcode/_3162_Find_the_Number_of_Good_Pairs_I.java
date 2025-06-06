package a_DSA_leetcode;

public class _3162_Find_the_Number_of_Good_Pairs_I {
	
    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        
    	int count = 0;
    	

    	for (int i = 0; i < nums1.length; i++) {
    		for (int j = 0; j < nums2.length; j++) {
    			if (nums1[i] % (nums2[j] * k) == 0) {
    				count++;
    			}
    		}
    	}
    	
    	return count;
    	
    }
	
	public static void main(String[] args) {
		int nums1[] = {1,3,4}, nums2[] = {1,3,4}, k = 1;
		System.out.println(numberOfPairs(nums1, nums2, k));
	}
}
