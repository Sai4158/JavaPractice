package a_DSA_leetcode;

public class _70_Climbing_Stairs {
	
    public static int climbStairs(int n) {
        
    	int ans = 0;
    	
    	
    	if(n == 1) {
    		return 1;
    		
    	}
    	
    	if(n == 2) {
    		return 2;
    		
    	}
    	
    	int one =  1;
    	int two = 2;
    	
    	for (int i = 0; i < n-2; i++) {
			
    		ans = one + two;
    		
    		one = two;
    		two = ans;
		}
    	
    	
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(climbStairs(n));
	}
}
