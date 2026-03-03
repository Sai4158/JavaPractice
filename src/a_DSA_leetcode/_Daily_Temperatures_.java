package a_DSA_leetcode;

public class _Daily_Temperatures_ {

    public static int[] dailyTemperatures(int[] temperatures) {

        // get size of array
        int n = temperatures.length;

        // answer array to store how many days to wait
        int ans[] = new int[n];

        // check each day one by one
        for (int i = 0; i < n; i++) {

            // default is 0 (no warmer day found yet)
            ans[i] = 0;

            // look for the next warmer day on the right side
            for (int j = i + 1; j < n; j++) {

                // if we find a warmer temperature
                if (temperatures[j] > temperatures[i]) {
                    ans[i] = j - i; // store number of days waited
                    break;          // stop at the first warmer day
                }
            }
        }

        // return final answer array
        return ans;
    }

    public static void main(String[] args) {

        int temp[] = {73, 74, 75, 71, 69, 72, 76, 73};

        System.out.println(java.util.Arrays.toString(dailyTemperatures(temp)));
    }
}