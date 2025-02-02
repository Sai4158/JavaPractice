package a_DSA_leetcode;

public class _1688_Count_of_Matches_in_Tournament {

    public static int numberOfMatches(int n) {
        
    	int total = 0;
    	
    	while(n > 1) {
    		int matches = n/2;
    		int remainingTeams = n - matches;
    		
    		total += matches;
    		
    		 n = remainingTeams;
    	}
    	return total;
    }
	
	public static void main(String[] args) {
		System.out.println(numberOfMatches(7));
	}
}
