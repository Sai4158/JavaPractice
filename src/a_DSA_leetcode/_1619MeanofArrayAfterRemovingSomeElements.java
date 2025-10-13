package a_DSA_leetcode;

import java.util.Arrays;

public class _1619MeanofArrayAfterRemovingSomeElements {

	   public static double trimMean(int[] arr) {
	        
	        int n = arr.length;
	        Arrays.sort(arr);
	        double count = 0;
	        
	        int k =  n/20;
	        
	        for(int i = k; i < n-k; i++){
	            count += arr[i];
	        }

	        return count/(n-2*k);

	    }
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
		System.out.println(trimMean(arr));
	}
}
