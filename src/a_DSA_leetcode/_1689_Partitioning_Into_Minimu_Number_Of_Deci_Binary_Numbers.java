package a_DSA_leetcode;

public class _1689_Partitioning_Into_Minimu_Number_Of_Deci_Binary_Numbers {

    public static int minPartitions(String n) {
        
    	int max = 0;
    	
    	for (int i = 0; i < n.length(); i++) {
			
    		int c =  n.charAt(i) - '0';
    		
    		if(c > max) {
    			max  = c;
    		}
		}
    	return max;
    }
    
    public static void main(String[] args) {
		String n = "32";
		System.out.println(minPartitions(n));
	}
}
