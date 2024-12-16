package a_DSA_leetcode;

public class _2520_Count_the_Digits_That_Divide_a_Number_ {
    public static int countDigits(int num) {
        int count = 0;
        int n = num; 

        for (int temp = n; temp > 0; temp /= 10) {
            int digit = temp % 10; 
            if (digit != 0 && num % digit == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 1248;
        System.out.println(countDigits(num)); 
    }
}
