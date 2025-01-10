package a_DSA_leetcode;

public class _2000_Reverse_Prefix_of_Word {
	
    public static String reversePrefix(String word, char ch) {
        
    	int n = word.length();
    	int len = 0;
    	
    	String reversed = "";
    	
    	 for (int i = 0; i < n; i++) {
             if (ch == word.charAt(i)) {
                 len = i;
                 break;
             }
         }
    	
    	
    	 if (len == -1) {
             return word;
         }

         // Reverse the prefix
         for (int i = len; i >= 0; i--) {
             reversed += word.charAt(i);
         }
         
         reversed += word.substring(len + 1);

         return reversed;
    	
    }
	
	public static void main(String[] args) {
		String word = "abcdefd";
		
		char ch = 'd';
		
		System.out.println(reversePrefix(word, ch));
	}
}
