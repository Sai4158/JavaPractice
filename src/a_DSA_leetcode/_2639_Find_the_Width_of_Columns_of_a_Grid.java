package a_DSA_leetcode;

public class _2639_Find_the_Width_of_Columns_of_a_Grid {
	
    public static int[] findColumnWidth(int[][] grid) {
        
    	int m =  grid.length;
    	int n =  grid[0].length;
    	int ans[] =  new int[n];
    	
    	for (int i = 0; i < n; i++) {
			
    		int maxWidth = 0;
    		
    		for (int j = 0; j < m; j++) {
				
    			int lenght = String.valueOf(grid[j][i]).length();
    			
    			maxWidth =  Math.max(maxWidth, lenght);
    			
			}
    		
    		ans[i] = maxWidth;
    		
		}
    	
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		
		int nums[][] = {{1},{22},{33}};
		System.out.println(findColumnWidth(nums));
	}
}
