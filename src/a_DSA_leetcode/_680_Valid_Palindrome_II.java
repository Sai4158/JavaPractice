package a_DSA_leetcode;

public class _680_Valid_Palindrome_II {
    
    public static boolean validPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    private static boolean isPalindrome(String s, int l, int r) {
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--; 
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(validPalindrome(s)); 
    }
}
