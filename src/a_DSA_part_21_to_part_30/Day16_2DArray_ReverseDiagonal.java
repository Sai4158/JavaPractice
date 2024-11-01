package a_DSA_part_21_to_part_30;

public class Day16_2DArray_ReverseDiagonal {
    public static void main(String[] args) {
        int arr[][] = {{34, 43, 45}, {43, 54, 65}, {45, 56, 64}};

        // Row count
        int r = arr.length;
        
        
        int c = arr[0].length;
        
        
        for (int i = 0; i < r; i++) {
            int j = c - i - 1; 
            System.out.println(arr[i][j]);
        }
    }
}
