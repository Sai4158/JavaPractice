package a_DSA_leetcode;

public class _1047_Remove_All_Adjacent_Duplicates_In_String {
	
    public static String removeDuplicates(String s) {
    	
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
        	
            char c = s.charAt(i);

            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1);
            } 
            
            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
	
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca")); 
        System.out.println(removeDuplicates("azxxzy")); 
    }
}
