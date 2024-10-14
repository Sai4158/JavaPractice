package recursion;

public class CountDownThenUp {

    // Method to count down and then up recursively
    public static void CountDownThenUp(int n) {
        if (n < 0) {
            return;
        }
        // Print the current value of n while counting down
        System.out.println(n);

        // Recursive call to count down
        CountDownThenUp(n - 1);

        // Print the current value of n while counting up
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 3;
        // Call the method to count down and then up
        CountDownThenUp(n);
    }
}
