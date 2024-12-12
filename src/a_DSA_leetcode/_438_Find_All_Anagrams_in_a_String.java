package a_DSA_leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class _438_Find_All_Anagrams_in_a_String {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int l = 0;
        int k = p.length();
        int n = s.length();

        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm1 = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);

            if (r - l + 1 == k) {
                if (hm1.equals(hm)) {
                    result.add(l);
                }
                char chl = s.charAt(l);
                hm1.put(chl, hm1.get(chl) - 1);
                if (hm1.get(chl) == 0) {
                    hm1.remove(chl);
                }
                l++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }
}
