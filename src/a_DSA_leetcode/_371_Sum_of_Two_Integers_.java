package a_DSA_leetcode;

public class _371_Sum_of_Two_Integers_ {

    public int getSum(int a, int b) {

        // If b becomes 0, there is no carry left to add.
        // So a already contains the final answer.
        if (b == 0) {
            return a;
        }

        // XOR (^) gives the sum of a and b WITHOUT carrying.
        // Example: 1 ^ 1 = 0, 1 ^ 0 = 1
        int sumWithoutCarry = a ^ b;

        // AND (&) finds where both bits are 1,
        // then we shift left by 1 to move the carry to the next bit position.
        int carry = (a & b) << 1;

        // until carry becomes 0.
        return getSum(sumWithoutCarry, carry);
    }

    public static void main(String[] args) {
    }
}
