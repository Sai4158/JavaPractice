package a_DSA_part_21_to_part_30;

public class Day16_2DArray_whileLoop {
	public static void main(String[] args) {
		
		int arr[][] = {{12,23,34},{45,56,67},{78,89,97}};

		
		int r = arr.length;
		int c = arr[0].length;
		
		int i =0;
		int j =c-1;
		
		
		while (i <r && j<c) {

			System.out.println(arr[i][j]);
			
			i++;
			j--;
		}
	}
}
