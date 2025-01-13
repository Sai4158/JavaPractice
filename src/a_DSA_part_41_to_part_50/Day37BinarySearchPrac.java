package a_DSA_part_41_to_part_50;

public class Day37BinarySearchPrac {
	
	public static int bs (int[] arr, int target) {
		
		int l = 0;
		int r = arr.length;
		
		while(l<=r) {
			int mid = l + (r-l)/2;
			
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] > target) {
				r = mid -1;
			}else {
				l = mid +1;
			}
		}
		
		return l;
	
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,9};
		int target = 2;
		
		System.out.println(bs(arr, target));
	}
}
