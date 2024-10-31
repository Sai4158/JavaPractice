package a_DSA_part_21_to_part_30;

public class Day16_2D_Array_diagonal {
	public static void main(String[] args) {
		
		int arr[][] = {{34,43,45},{43,54,65},{45,56,64}};
		
//		Prints the diagonal 2D Array
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.println(arr[i][i]);
		}
		
//		34
//			54
//				64
	}
}
