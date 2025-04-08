package a_DSA_part_61_to_part_70;

import java.util.ArrayList;
import java.util.List;

public class Day64_luckyNumbers {
    
	public static List<Integer> luckyNumbers(int[][] matrix) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < matrix.length; i++) {
			
			int val = matrix[i][0];
			int position = 0;
			
			
			for (int j = 0; j < matrix[0].length; j++) {
				
				if(matrix[i][j] < val) {
					
					val = matrix [i][j];
					position = j;
					
				}
				
				
			}
				boolean a =  true;
				
				for (int k = 0; k < matrix.length; k++) {
					
					if(matrix[k][position] > val){
						a =  false;
						break;
					}
					
				}
				
				
				if(a) {
					al.add(val);
				}
			
		}
		return al;
		
    }
    
    
    public static void main(String[] args) {
	    int[][] matrix = {
	            {3, 7, 8},
	            {9, 11, 13},
	            {15, 16, 17}
	        };

	        System.out.println(luckyNumbers(matrix));
	}
}
