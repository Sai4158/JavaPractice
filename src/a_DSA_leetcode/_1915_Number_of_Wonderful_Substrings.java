package a_DSA_leetcode;

import java.util.HashMap;

public class _1915_Number_of_Wonderful_Substrings {

    public static long wonderfulSubstrings(String word) {
    	
    	long[] freq = new long[1024];
        freq[0] = 1; 

        int mask = 0;
        long ans = 0;

        for (char ch : word.toCharArray()) {
            int bit = ch - 'a';

            // flip this character's bit
            mask ^= (1 << bit);

            // case 1: all counts even
            ans += freq[mask];

            // case 2: exactly one letter has odd count
            for (int i = 0; i < 10; i++) {
                ans += freq[mask ^ (1 << i)];
            }

            // store this mask
            freq[mask]++;
        }

        return ans;
    }
    
    public static void main(String[] args) {
		String word = "aba";
		System.out.println(wonderfulSubstrings(word));
	}
	
}
