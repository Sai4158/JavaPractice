package a_DSA_part_41_to_part_50;

public class Day41_Count_of_Matches_in_Tournament {
	
    public static int numberOfMatches(int n) {
    	
    	int total = 0;
    	
    	 while(n > 0) {
    		 int matches =  n/2; //3
    		int remTeams = n - matches; //7-3 = 4
    		
    		total += matches; //= 3
    	
    		
    		n = remTeams;
    	 }
    	 
    	 return total;
    }
	
	public static void main(String[] args) {
		int n = 7;
		
		System.out.println(numberOfMatches(n));
	}
}
