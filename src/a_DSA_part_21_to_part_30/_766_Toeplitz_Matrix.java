package a_DSA_part_21_to_part_30;

public class _766_Toeplitz_Matrix {
	public static void main(String[] args) {
		
		int arr[][] =  {{1,2,3,4},{5,1,65,3},{9,5,1,2}};

		System.out.println(isToeplitzMatrix(arr));
	}


	public static boolean validFun(int[][] matrix, int y, int x) {
			
		int r = matrix.length;
		int c = matrix[0].length;
		int temp =  matrix[y][x];
		boolean valid = true;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				 if(matrix[i][j]!=temp) {
					 valid = false;
				}
			}
		}
		return valid;
	}


	public static boolean isToeplitzMatrix(int[][] matrix) {
			
		int r = matrix.length;
		int c = matrix[0].length;
		boolean ans =  true;
		
		
		for (int i = 1; i < r; i++) {
			 boolean temp = validFun(matrix, i, 0);
			if(temp == false) {
				ans =  false;
			}
		}
		
		for (int i = 0; i < c; i++) {
			 boolean temp = validFun(matrix, 0, i);
			
			if(temp == false) {
				ans = false;
			}
		}
		
		return ans;
	}
}
