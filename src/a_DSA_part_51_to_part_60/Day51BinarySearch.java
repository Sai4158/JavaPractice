package a_DSA_part_51_to_part_60;import java.util.Arrays;

import javax.swing.text.Position.Bias;

public class Day51BinarySearch {
	
	public static int BinarySearch(int arr[], int target) {
		
		int n = arr.length;
		int l = 0;
		int r = n-1;
				
		 Arrays.sort(arr); 

	        while (l <= r) { 
	            int mid = l + (r - l) / 2;

	            if (arr[mid] == target) {
	                return mid;
	            } else if (arr[mid] < target) {
	                l = mid + 1; 
	            } else {
	                r = mid - 1;
	            }
	        }

	        return -1; 
	    }
	
	public static void main(String[] args) {
		int arr[] = {2,4,7,23,45,56,32,34,56,6,32,6,2};
		int target = 45;
		
		System.out.println(BinarySearch(arr, target));
	}
}
