package a_DSA_part_11_to_part_20;

import java.util.Iterator;

public class Day15_2Darray_indexing {
	public static void main(String[] args) {
		
		int array[][] = {{1,2},{3,5},{7,4}};
		
		int r =  array.length;
		int c = array[0].length;
		
		System.out.println(r + " " + c);
		System.out.println("");
		
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println(array[i][j] + ",");
			}
		}
	}
}
