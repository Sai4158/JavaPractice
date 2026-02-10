package a_DSA_leetcode;

public class _3114_Latest_Time_You_Can_Obtain_After_Replacing_Characters {

    public static String findLatestTime(String s) {

        char[] ans = s.toCharArray();

        if (ans[0] == '?') {
            if (ans[1] != '?' && ans[1] > '1') {
                ans[0] = '0';
            } else {
                ans[0] = '1';
            }
        }

        if (ans[1] == '?') {
            if (ans[0] == '1') ans[1] = '1';
            else ans[1] = '9';
        }

        if (ans[3] == '?') {
            ans[3] = '5';
        }

        if (ans[4] == '?') {
            ans[4] = '9';
        }

        return new String(ans);
    }

    public static void main(String[] args) {
        String s = "1?:?4";
        System.out.println(findLatestTime(s)); 
    }
}
