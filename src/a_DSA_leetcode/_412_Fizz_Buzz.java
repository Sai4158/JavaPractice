package a_DSA_leetcode;

import java.util.ArrayList;

public class _412_Fizz_Buzz {
    
    // Method to perform FizzBuzz logic
    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<String> result = fizzBuzz(15);
        
        // Printing the FizzBuzz result
        for (String s : result) {
            System.out.println(s);
        }
    }
}
