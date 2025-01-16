package a_DSA_part_41_to_part_50;

public class Day38_Find_the_index_of_left_most {
	
public static int bspromb(int arr[], int target) {
		
		int l = 0;
		int r =  arr.length - 1;
		int result = -1;
		
		while(l <= r) {
			int mid =  l + (r-l)/2;
			
			if(arr[mid] == target) {
					
			result = mid;
				
			 r =  mid + 1;
			}else if(arr[mid]>target) {
				 r = mid-1;
			}else {
				 l = mid +1;
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3,3,6,3,3,3,3,6,7};
		int target  =  3;
		
		System.out.println(bspromb(arr, target));
	}
}
