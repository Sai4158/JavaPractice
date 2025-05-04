package a_DSA_leetcode;

public class _1945_Sum_of_Digits_of_String_After_Convert {

    public static int getLucky(String s, int k) {
        String num = "";

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a' + 1;
            num += val;
        }

        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < num.length(); j++) {
                sum += num.charAt(j) - '0';
            }
            
            num = String.valueOf(sum);
        }

        return Integer.parseInt(num);
    }

    public static void main(String[] args) {
        System.out.println(getLucky("iiii", 1));      
        System.out.println(getLucky("leetcode", 2));  
        System.out.println(getLucky("zbax", 2));      
    }
}
