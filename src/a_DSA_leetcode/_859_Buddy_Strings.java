package a_DSA_leetcode;

public class _859_Buddy_Strings {
	    public boolean buddyStrings(String s, String goal) {

	    	if (s.length() != goal.length()) {
	            return false;
	        }

	        String mix = s + s;

	        if (s.equals(goal)) {
	            for (int i = 0; i < s.length() - 1; i++) {
	                for (int j = i + 1; j < s.length(); j++) {
	                    if (s.charAt(i) == s.charAt(j)) {
	                        return true; 
	                    }
	                }
	            }
	            return false; 
	        }

	        int first = -1, second = -1;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) != goal.charAt(i)) {
	                if (first == -1) {
	                    first = i; 
	                } else if (second == -1) {
	                    second = i; 
	                } else {
	                    return false;
	                }
	            }
	        }

	        return second != -1 &&
	               s.charAt(first) == goal.charAt(second) &&
	               s.charAt(second) == goal.charAt(first);
	    }

	    public static void main(String[] args) {
	    	_859_Buddy_Strings sol = new _859_Buddy_Strings();
	        System.out.println(sol.buddyStrings("ab", "ba")); 
	      
	    }
	}


