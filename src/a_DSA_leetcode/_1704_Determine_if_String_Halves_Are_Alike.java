package a_DSA_leetcode;

public class _1704_Determine_if_String_Halves_Are_Alike {
	
    public static boolean halvesAreAlike(String s) {
        
    	int a = 0;
    	int b = 0;
    	boolean ans =  true;
    	int mid = s.length()/2;
    	
    	
    	for (int i = 0; i <s.length(); i++) {
		
    		if( i < mid && isVowel(s.charAt(i))) {
    			a++;
    		}else if( i >= mid && isVowel(s.charAt(i))) {
    			b++;
    		}
    		
		}
    	
    	return a == b;
    }
    
    
    public static boolean isVowel(char c) {
    	return "aeiouAEIOU".indexOf(c) != -1;
    }

	
	public static void main(String[] args) {
		String s = "book";
		System.out.println(halvesAreAlike(s));
	}
}
