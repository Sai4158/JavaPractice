package a_DSA_leetcode;

public class _557_Reverse_Words_in_a_String_III {

    public static String reverseWords(String s) {
        
    	 String[] words = s.split(" ");
    	
    	 for (int i = 0; i < words.length; i++) {
    	    words[i] = new StringBuilder(words[i]).reverse().toString(); 
		}
    	return String.join(" ", words); 
    }
	
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
}
