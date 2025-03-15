package a_DSA_part_51_to_part_60;

public class Day54_2DArray {
	
	public static int findChampion(int[][] nums) {
		
		int maxcount = 0;
		int n =  nums.length;
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			int count = 0;
			
			for (int j = 0; j < n; j++) {
				if(nums[i][j] == 1) {
					count++;
				}
			}
			
			if(count> maxcount) {
				maxcount =  count;
				ans = i;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int grid[][] = {{0,1},{1,1}};
		System.out.println(findChampion(grid));
	}

	
}
