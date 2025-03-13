package a_DSA_leetcode;

import java.lang.module.FindException;

public class _2923_Find_Champion_I {

    public static int findChampion(int[][] grid) {

    	int ans = 0;
    	int n =  grid.length;
		int maxcount = 0;

    	for (int i = 0; i < n; i++) {
        	int count = 0;

    		for (int j = 0; j < n; j++) {
				if(grid[i][j] == 1) {
					count++;
				}
			}
    		
    		
    		if(count > maxcount) {
    			maxcount =  count;
    			
    			ans = i;
    		}
    		
		}
    	return ans;
    }
	
	public static void main(String[] args) {
		int grid[][] = {{0,1},{0,0}};
		System.out.println(findChampion(grid));
	}
}
