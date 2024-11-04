package a_DSA_part_21_to_part_30;

public class Day16_while2dayArray {
	public static void main(String[] args) {
		int arr[][] = {{12,23,34,56},{45,56,67,78},{78,89,97,89}};

		
		int r = arr.length;
		int c = arr[0].length;
		
		int i = 0;
		int j = 2;
		
		while(i<r  && i<c) {
			System.out.println(arr[i][j]);
			
			i++;
			j++;
		}
	}
}
