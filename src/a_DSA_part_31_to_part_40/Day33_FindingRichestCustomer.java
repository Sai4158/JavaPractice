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
	        int arr[][] = {{3, 4}, {5, 6}};
	        System.out.println(maximumWealth(arr)); 
	    }
}
