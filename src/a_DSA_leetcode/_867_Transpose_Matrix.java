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
		
	}
}
