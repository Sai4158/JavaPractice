package a_DSA_leetcode;

public class _1672_Richest_Customer_Wealth {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0; 

        // Loop through each customer's accounts
        for (int i = 0; i < accounts.length; i++) {
            int totalWealth = 0; 

            for (int j = 0; j < accounts[i].length; j++) {
                totalWealth += accounts[i][j]; 
            }

            
            if (totalWealth > maxWealth) {
                maxWealth = totalWealth;
            }
        }

        return maxWealth; 
    }

    public static void main(String[] args) {
        int arr[][] = {{3, 4}, {5, 6}};
        System.out.println(maximumWealth(arr)); 
    }
}
