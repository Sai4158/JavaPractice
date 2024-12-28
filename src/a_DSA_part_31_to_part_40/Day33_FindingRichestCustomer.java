package a_DSA_part_31_to_part_40;

public class Day33_FindingRichestCustomer {
	 public static int maximumWealth(int[][] accounts) {
	        int maxWealth = 0;

	        for (int[] customer : accounts) { 
	            int totalWealth = 0;
	            for (int wealth : customer) { 
	                totalWealth += wealth;
	            }
	            maxWealth = Math.max(maxWealth, totalWealth); 
	        }

	        return maxWealth;
	    }

	 public static void main(String[] args) {
		    // Test Case 1: Simple case with two customers
		    int[][] arr1 = {{3, 4}, {5, 6}};
		    System.out.println("Test Case 1: " + maximumWealth(arr1)); // Expected Output: 11

		    // Test Case 2: One customer only
		    int[][] arr2 = {{10, 20, 30}};
		    System.out.println("Test Case 2: " + maximumWealth(arr2)); // Expected Output: 60

		    // Test Case 3: Customers with varying wealth
		    int[][] arr3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		    System.out.println("Test Case 3: " + maximumWealth(arr3)); // Expected Output: 24

		    // Test Case 4: Customers with zero wealth
		    int[][] arr4 = {{0, 0, 0}, {0, 0, 0}};
		    System.out.println("Test Case 4: " + maximumWealth(arr4)); // Expected Output: 0

		    // Test Case 5: Single bank account for each customer
		    int[][] arr5 = {{10}, {20}, {30}, {40}};
		    System.out.println("Test Case 5: " + maximumWealth(arr5)); // Expected Output: 40

		    // Test Case 6: Large values in accounts
		    int[][] arr6 = {{1000, 2000}, {3000, 4000}};
		    System.out.println("Test Case 6: " + maximumWealth(arr6)); // Expected Output: 7000
		}

}
