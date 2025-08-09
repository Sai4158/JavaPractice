package a_DSA_leetcode;

public class _2063_Vowels_of_All_Substrings {

    public static long countVowels(String word) {
        
    	int n = word.length();
    	int count = 0;
    	
    	
    	for (int i = 0; i < n; i++) {
			
    		char c =  word.charAt(i);
    		
    		if(isvowel(c)) {
    			count += (long)(i+1)*(n-i);
    		}
    		
		}
    	
    	return count;
    	
    }
    
    private static boolean isvowel(char c) {
		
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static void main(String[] args) {
		String word = "aba";
		System.out.println(countVowels(word));
	}
}
