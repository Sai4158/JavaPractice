package a_DSA_leetcode;

public class _62_Unique_Paths {

    public static int uniquePaths(int m, int n) {

//    	Use double array
    	int [][] dp = new int[m][n];
    	
    	for (int i = 0; i < m; i++) {
			
    		for (int j = 0; j < n; j++) {
				
                if (i == 0 || j == 0) dp[i][j] = 1;

    			
    			else {
    				dp[i][j] =  dp[i - 1][j] + dp[i][j - 1];
    			}
			}
    		
		}
    	
//    	Return the last 
        return dp[m - 1][n - 1];
    	
    }
    
    // Main
    public static void main(String[] args) {
		int m = 3, n = 2;
		System.out.println(uniquePaths(m, n));
	}
	
}
