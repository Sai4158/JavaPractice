package a_DSA_leetcode;

public class _1351_Count_Negative_Numbers_in_a_Sorted_Matrix {
    
	
	public static int countNegatives(int[][] grid) {
        
		int n =  grid.length;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j]<0) {
					count++;
				}
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		
		int nums[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println(countNegatives(nums));
	}
}
