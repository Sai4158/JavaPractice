package a_DSA_leetcode;

public class _3136_Valid_Word {

    public static boolean isValid(String word) {
        
        int n = word.length();
        if (n < 3) return false; 

        boolean hasVowel = false;
        boolean hasConsonant = false;
        
    	for (char c : word.toCharArray()) {
			
    		if(!Character.isLetterOrDigit(c)) {
    			return false;
    		}
    			
    		
    		if(Character.isLetter(c)) {
    			
    			char lower = Character.toLowerCase(c);
    			
    			 if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                     hasVowel = true;
                 } 
    			 
    			 else {
    				 hasConsonant =  true;
    			 }
    		}
		}
    	
    	return hasConsonant && hasVowel;
    	
    }
	
	public static void main(String[] args) {
		
		
		String word = "234Adas";
		System.out.println(isValid(word));
	}
}
