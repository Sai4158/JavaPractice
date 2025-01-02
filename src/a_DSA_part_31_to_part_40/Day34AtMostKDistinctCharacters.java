package a_DSA_part_31_to_part_40;

import java.util.HashMap;

public class Day34AtMostKDistinctCharacters {

	  public static int lengthOfLongestSubstringKDistinct(String s, int k) {
	        int l = 0;
	        int ans = 0;
	        HashMap<Character, Integer> charCount = new HashMap<>();

	        for (int r = 0; r < s.length(); r++) {
	            char rightChar = s.charAt(r);
	            
	            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);

	            while (charCount.size() > k) {
	                char leftChar = s.charAt(l);
	                
	                charCount.put(leftChar, charCount.get(leftChar) - 1);
	                
	                if (charCount.get(leftChar) == 0) {
	                    charCount.remove(leftChar);
	                }
	                
	                l++;
	            }

	            ans = Math.max(ans, r - l + 1);
	        }

	        return ans;
	    }

	    public static void main(String[] args) {
	        String s = "eceba";
	        int k = 2;
	        System.out.println(lengthOfLongestSubstringKDistinct(s, k)); 
	    }
	}
