package a_DSA_leetcode;

public class _3304_Find_the_K_th_Character_in_String_Game_I {
	
    public static char kthCharacter(int k) {
       
    	StringBuilder word = new StringBuilder("a");
    	
    	while(word.length() < k) {
    		
    		StringBuilder next =  new StringBuilder();
    		
    		for (int i = 0; i < word.length(); i++) {
				
    			char ch = word.charAt(i);
    			char nextChar = (char)(ch+1);
    			
    			next.append(nextChar);
    			
			}
    		word.append(next);
    	}
        return word.charAt(k - 1);
    }
	
	public static void main(String[] args) {
		
		int k = 5;
		System.out.println(kthCharacter(k));
		
	}
}
