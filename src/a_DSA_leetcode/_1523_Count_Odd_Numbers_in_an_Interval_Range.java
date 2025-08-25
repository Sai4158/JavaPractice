package a_DSA_leetcode;


public class _1523_Count_Odd_Numbers_in_an_Interval_Range {

    public static int countOdds(int low, int high) {
        
    	int n =  oddsup(high) - oddsup(low - 1);
		
    	return n;
    	
    }
    
    private static int oddsup(int n) {
    	
    	if(n < 0)return 0;
    	
    	return (n+1)/2;
    	
	}
    
    
    public static void main(String[] args) {
		
    	int low = 3, high = 7;
    	System.out.println(countOdds(low, high));
    	
	}
	
}
