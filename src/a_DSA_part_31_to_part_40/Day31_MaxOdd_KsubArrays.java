package a_DSA_part_31_to_part_40;

public class Day31_MaxOdd_KsubArrays {
	public static void main(String[] args) {
		
//		find the max k odd Sub arrays in the array
		
		int arr[] = {1,2,3,4,5,6};
		int l = 0 ;
		int temp = 0 ;
		int ans = 0 ;
		int k = 0 ;

	
		for (int r = 0; r < arr.length; r++) {
			if(arr[r] %2 ==1) {
				temp++;
			}
			
			
			while(temp>k) {
				if(arr[r]%2==1) {
					temp--;
				}
				l++;
			}
			System.out.println("");
		}
	
	}
}
