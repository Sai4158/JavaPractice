package a_DSA_part_31_to_part_40;

public class Day33_1672_Richest_Customer_Wealth {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int totalWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
            	totalWealth += accounts[i][j];
                maxWealth = Math.max(maxWealth, totalWealth);

            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int arr[][] = {{2, 8}, {7, 3}, {4, 6}};
        System.out.println(maximumWealth(arr)); 
    }
}