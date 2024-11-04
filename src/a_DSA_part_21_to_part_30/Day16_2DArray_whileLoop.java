package a_DSA_part_21_to_part_30;

public class Day16_2DArray_whileLoop {
	public static void main(String[] args) {
		
		int arr[][] = {{34,43,45},{43,54,65},{45,56,64}};

		
		int r = arr.length;
		int c = arr[0].length;
		
		int i =0;
		int j =0;
		
		
		while (i <r && j<c) {

			System.out.println(arr[i][j]);
			
			i++;
			j++;
		}
	}
}
