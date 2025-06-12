package a_DSA_leetcode;

public class _3502_Minimum_Cost_to_Reach_Every_Position {
	
    public static int[] minCosts(int[] cost) {
        
    	int n = cost.length;
    	int ans[] = new int[n];
    	
//    	Fill the array ans with max integers
    	for (int i = 0; i < n; i++) {
    		ans[i] = Integer.MAX_VALUE;
		}
    	
    	 for (int i = 0; i < n; i++) {
             for (int j = i; j < n; j++) {
                 ans[j] = Math.min(ans[j], cost[i]);
             }
         }
    	
    	return ans;
    	
    }
	
	public static void main(String[] args) {
		
		int cost[] = {5,3,4,1,3,2};
		System.out.println(minCosts(cost));
		
	}
}	
