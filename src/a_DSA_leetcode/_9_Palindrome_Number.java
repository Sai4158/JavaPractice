package a_DSA_leetcode;

public class _9_Palindrome_Number {
	public static boolean isPalindrome(int x) {
        // Convert to String first
       String s = String.valueOf(x); 
        int n = s.length(); 

        // Divide the list into 2 firs
         for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        // Always return true unless it goes throug if else
        return true;
     
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(4554));
		System.out.println(isPalindrome(4555));
	}
}
