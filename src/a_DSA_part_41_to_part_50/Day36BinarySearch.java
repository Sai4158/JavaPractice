package a_DSA_part_41_to_part_50;

public class Day36BinarySearch {
	
	public static int bs(int arr[], int target) {
		
		
		int l = 0;
		int r = arr.length-1;
		
		
		while(l<=r) {
			int mid =  (l+r)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] > target) {
				r = mid -1;
			}else {
				l = mid +1;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {4,5,7,3,2,5,2};
		int target = 3;
		
		System.out.println(bs(arr, target));
	}
}
