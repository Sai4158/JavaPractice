package a_DSA_leetcode;

import java.util.HashMap;

public class _1876_Substrings_of_Size_Three_with_Distinct_Characters_SubString {
    public static void main(String[] args) {
        String s = "abccbabcba";
        int n = s.length();
        int k = 3; // Substring size
        int l = 0; // Left pointer
        int ans = 0; // Answer variable

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r); // Current character
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

            // Shrink window if size exceeds k
            if (r - l + 1 > k) {
                char tch = s.charAt(l);
                hm.put(tch, hm.get(tch) - 1);
                if (hm.get(tch) == 0) {
                    hm.remove(tch);
                }
                l++; // Move left pointer
            }

            // Check if all characters are distinct
            if (hm.size() == k) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
