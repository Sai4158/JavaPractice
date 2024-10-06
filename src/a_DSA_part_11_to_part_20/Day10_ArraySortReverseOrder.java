package a_DSA_part_11_to_part_20;

import java.util.Arrays;
import java.util.Collections;

public class Day10_ArraySortReverseOrder {
	public static void main(String[] args) {
		
//		Make sure to use integer here
		Integer a[] = {4,5,4,675,34,5,6,5};
		
//		Collection.reverseOrder
		Arrays.sort(a, Collections.reverseOrder());
		
//		Converse the arrays tosString here
		 System.out.println(Arrays.toString(a));
	}
}
