package a_DSA_leetcode;

public class _1961_Check_If_String_Is_a_Prefix_of_Array {

	 public static boolean isPrefixString(String s, String[] words) {

	        StringBuilder sb = new StringBuilder();

//	        only run until words
	        for (int i = 0; i < words.length; i++) {
	            sb.append(words[i]);

//	            if this is not equal return false 
	            if (!s.startsWith(sb.toString())) {
	                return false;
	            }

//	            only return true if all equal to s 
	            if (sb.toString().equals(s)) {
	                return true;
	            }
	        }

	        return false; 
	    }

	public static void main(String[] args) {
		String s = "iloveleetcode";
		String[] words = {"i", "love", "leetcode", "apples"};
		System.out.println(isPrefixString(s, words)); 
	}
}
