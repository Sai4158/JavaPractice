package a_DSA_leetcode;

public class _3271_Hash_Divided_String {

	    public static String stringHash(String s, int k) {
	      
	    	int n = s.length();
	    	StringBuilder ans = new StringBuilder();
	    	
	    	for (int i = 0; i < n; i+=k) {
				
	    		int sum = 0;
	    		
	    		for (int j = i; j < i + k; j++) {
					
	    			sum += s.charAt(j) - 'a';
	    			
	    			
				}
	    		
	    		char hashedChar = (char) ('a' + (sum % 26));
	    		ans.append(hashedChar);
	
			}
	    	
	    	return ans.toString();
	    	
	    }
	
	public static void main(String[] args) {
		String s = "abcd"; 
		int k = 2;
		
		System.out.println(stringHash(s, k));
	}
}
