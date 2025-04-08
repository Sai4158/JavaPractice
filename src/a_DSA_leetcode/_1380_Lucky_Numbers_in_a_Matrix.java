package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _1380_Lucky_Numbers_in_a_Matrix {
	
    public static List<Integer> luckyNumbers(int[][] matrix) {
        
    	ArrayList<Integer> al = new ArrayList<Integer>();

    	   for (int i = 0; i < matrix.length; i++) {

               int minVal = matrix[i][0];
               int minIndex = 0;

               for (int j = 1; j < matrix[0].length; j++) {
                   if (matrix[i][j] < minVal) {
                       minVal = matrix[i][j];
                       minIndex = j;
                   }
               }
    	
               boolean isMax = true;
               for (int k = 0; k < matrix.length; k++) {
                   if (matrix[k][minIndex] > minVal) {
                       isMax = false;
                       break;
                   }
               }

               if (isMax) {
                   al.add(minVal);
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
