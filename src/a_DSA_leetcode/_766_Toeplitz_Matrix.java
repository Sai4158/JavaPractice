package a_DSA_leetcode;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

import aa_prac1.Main;

public class _766_Toeplitz_Matrix {
	 
	 public static boolean validFun(int[][] matrix, int y, int x) {
	        
		 int r = matrix.length;
		 
		 int c = matrix[0].length;
		 
		 int i = y;
		 int j = x;
		 
		 int temp = matrix[i][j];
		 
		 boolean valid = true;
		 
		 while(i<r && j<c) {
			 
			 if(matrix[i][j]!=temp) {
				 valid =false;
			 }
			 
			 i++;
			 j++;
		 }
		 return valid;
		 
	    }
	 
	 public static boolean isToeplitzMatrix(int[][] matrix) {
	        boolean ans = true;
	        
	        int r = matrix.length;
	        int c = matrix[0].length;
	        
		 for (int i = 1; i < r; i++) {
			 boolean temp = validFun(matrix, i, 0);
			 
			 if(temp ==false) {
				 ans = false;
			 }
		}
		 
		 for (int j = 0; j < c; j++) {
			 boolean temp = validFun(matrix, 0, j);
			 if(temp ==false) {
				 ans = false;
			 }
			}
		 return ans;
	    }
	 
	public static void main(String[] args) {
		int arr[][] =  {{1,2,3,4},{5,1,65,3},{9,5,1,2}};
	
		
		System.out.println(isToeplitzMatrix(arr));
	}
}
