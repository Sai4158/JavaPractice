package a_DSA_leetcode;

public class _867_Transpose_Matrix {

    public static int[][] transpose(int[][] matrix) {
        
    	int m = matrix.length;
    	int n =  matrix[0].length;
    	
    	int ans[][] = new int[n][m];

    	
    	
    	for (int i = 0; i < m; i++) {
			
    		for (int j = 0; j < n; j++) {
				
    			ans[j][i] =  matrix[i][j];
    			
			}
    		
		}
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(transpose(matrix));
		
		int matrix2[][] = {{1,3,43},{4,5,46},{467,6,9}};
		System.out.println(transpose(matrix2));
		
		int matri3[][] = {{1,2,3},{4,5,6},{4,5,6}};
		System.out.println(transpose(matri3));
		
		int matri4[][] = {{4,5,6},{4,5,6},{3,1,3}};
		System.out.println(transpose(matri4));
		
	}
}
