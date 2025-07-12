package a_DSA_part_71_to_part_80;

public class Day79_FindtheWidthofColumnsofaGrid {
	
    public static int[] findColumnWidth(int[][] grid) {

    	
    	int n = grid.length;
    	int m =  grid[0].length;
    	int ans[] = new int[m];
    	
    	for (int i = 0; i < m; i++) {
			
    		int max = 0;
    		
    		for (int j = 0; j < n; j++) {
				
    			int lenght =  String.valueOf(grid[j][i]).length();
    			
    			max = Math.max(max, lenght);
    			
			}
    		
    		ans[i] = max;
		}
    	
    	return ans;
    	
    }
	
	public static void main(String[] args) {
		
		int gird[][] =  {{1},{22},{33}};
		System.out.println(findColumnWidth(gird));
	}
}
