package a_DSA_leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class _2182_Construct_String_With_Repeat_Limit {

    public static String repeatLimitedString(String s, int repeatLimit) {

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Freq> pq = new PriorityQueue<>((a, b) -> b.key - a.key);
        for (char ch : hm.keySet()) {
            pq.add(new Freq(ch, hm.get(ch)));
        }

        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {
            Freq top = pq.poll();            
            char ch = top.key;
            int cnt = top.value;

            int use = Math.min(cnt, repeatLimit);
            for (int i = 0; i < use; i++) ans.append(ch);
            cnt -= use;


            if (cnt > 0) {
                if (pq.isEmpty()) break;    

                Freq second = pq.poll();     
                ans.append(second.key);
                second.value--;

                if (second.value > 0) pq.add(second); 
                pq.add(new Freq(ch, cnt));            
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "cczazcc";
        int repeatLimit = 3;
        System.out.println(repeatLimitedString(s, repeatLimit));
    }
}

class Freq {
    char key;
    int value;

    Freq(char key, int value) {
        this.key = key;
        this.value = value;
    }
}
