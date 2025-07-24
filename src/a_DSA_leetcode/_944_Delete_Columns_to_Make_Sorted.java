package a_DSA_leetcode;

public class _944_Delete_Columns_to_Make_Sorted {
	
    public int minDeletionSize(String[] strs) {
        int count = 0; 
        int n = strs.length;
        int m = strs[0].length();

        for (int col = 0; col < m; col++) {
            for (int row = 1; row < n; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    count++; 
                    break;
                }
            }
        }

        return count;
    }
	
	public static void main(String[] args) {
		
	}
}
