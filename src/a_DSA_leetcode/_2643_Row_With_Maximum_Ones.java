package a_DSA_leetcode;

public class _2643_Row_With_Maximum_Ones {

	public static int[] rowAndMaximumOnes(int[][] mat) {

		int n = mat.length;
		int maxCount = 0; 
		int ans[] = new int[2];


		for (int i = 0; i <n; i++) {
			int count = 0;

			for (int j = 0; j <mat[i].length; j++) {

				if(mat[i][j] == 1) {
					count++;
				}
			}

			if (count > maxCount) {
				maxCount = count;
				ans[0] = i;  
				ans[1] = maxCount;  
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[][] mat1 = {{0,1},{1,0}};
		System.out.println(java.util.Arrays.toString(rowAndMaximumOnes(mat1)));
	}
}
