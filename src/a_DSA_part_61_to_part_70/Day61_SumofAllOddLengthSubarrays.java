package a_DSA_part_61_to_part_70;

public class Day61_SumofAllOddLengthSubarrays {
	
	public static int sumOddLengthSubarrays(int[] arr) {

		int count = 0;
		int n =  arr.length;
		
		for (int i = 0; i < n; i++) {
			
			int temp = 0;
			
			for (int j = i; j < n; j++) {
				
				temp += arr[j];
				
				int current = j-i+1;
				
				
				if(current % 2 == 1) {
					count += temp;
				}
				
			}
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,4,2,5,3};
		System.out.println(sumOddLengthSubarrays(arr));
	}
}
