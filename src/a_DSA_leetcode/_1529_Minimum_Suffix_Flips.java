package a_DSA_leetcode;

public class _1529_Minimum_Suffix_Flips {
	
    public static int minFlips(String target) {
        
    	int n =  target.length();
    	
    	int count = 0;
    	char excepted  =  '0';
    	
    	for (int i = 0; i < n; i++) {
			
    		if(target.charAt(i) != excepted) {
    			
    			count ++;
    			excepted = target.charAt(i);
    		}
    		
		}
    	
    	return count;
    	
    }
	
	public static void main(String[] args) {
		String  target = "10111";
		System.out.println(minFlips(target));
	}
}
