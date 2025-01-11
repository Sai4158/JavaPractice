package a_DSA_leetcode;

public class _796_Rotate_String {
	 public static boolean rotateString(String s, String goal) {
	        if (s.length() != goal.length()) {
	            return false;
	        }

	        String mix  = s + s;

	        boolean check = mix.contains(goal);

	        return check;
	    }
	 
	 
	 public static void main(String[] args) {
		
		 String s =  "abcde";
		 String goal = "cdeab";
		 
		 System.out.println(rotateString(s, goal));
	}
}
