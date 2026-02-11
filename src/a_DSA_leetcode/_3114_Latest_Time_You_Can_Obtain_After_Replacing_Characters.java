package a_DSA_leetcode;

public class _3114_Latest_Time_You_Can_Obtain_After_Replacing_Characters {

    public static String findLatestTime(String s) {

        char[] ans = s.toCharArray();

        // pick best hour tens (0 or 1)
        if (ans[0] == '?') ans[0] = (ans[1] != '?' && ans[1] > '1') ? '0' : '1';

        // pick best hour ones (depends on hour tens)
        if (ans[1] == '?') ans[1] = (ans[0] == '1') ? '1' : '9';

        // pick best minute tens (max 5)
        if (ans[3] == '?') ans[3] = '5';

        // pick best minute ones (max 9)
        if (ans[4] == '?') ans[4] = '9';

        return new String(ans); 
    }

    public static void main(String[] args) {
        String s = "1?:?4";
        System.out.println(findLatestTime(s)); 
    }
}
