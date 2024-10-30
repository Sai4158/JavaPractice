package a_DSA_part_11_to_part_20;

public class Day15_2Darray_firstSet {
	public static void main(String[] args) {
		
		int arr[][] = {{2,2,3,5},{3,4,5,5}};
		
		
		int r = arr.length;
		int c = arr[0].length;
	
		for (int i = 0; i < c; i++) {
			System.out.println(arr[0][i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < c; i++) {
			System.out.println(arr[1][i]);
		}
	}
}

//2
//2
//3
//5
//
//3
//4
//5
//5
