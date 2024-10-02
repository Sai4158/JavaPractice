package a_DSA_leetcode;

import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
    
//    Get the length
    	int n = nums.length;
//    Create a new array witht size of n
    	int arr[] =  new int[n];
    	
    	
//    	for loop
    	for (int i = 0; i < n; i++) {
    		
//    	arr[i] = at arr[index]
			arr[i] = nums[i] * nums[i];
		}
    	
//     Sort arrays - when using make sure to coveret Arrays.toString in the end
    	
    	Arrays.sort(arr);
    	
//    	return 
    	return arr;
    }
    
    
//    Main method
    public static void main(String[] args) {
    	int a[] = {4,4,5,-6,4,88,23};
    		
//    	Make sure to convert arrays to string here since we are using Arrays.sort
    	System.out.println(Arrays.toString(sortedSquares(a)));
//    	[16, 16, 16, 25, 36, 529, 7744]

	}
}
