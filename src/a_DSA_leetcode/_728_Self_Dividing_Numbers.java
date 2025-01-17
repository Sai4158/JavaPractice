package a_DSA_leetcode;

import java.util.ArrayList;


public class _728_Self_Dividing_Numbers {
	
	
    public static ArrayList<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            int temp = num;
            
            boolean isSelfDividing = true;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit == 0 || num % digit != 0) {
                    isSelfDividing = false;
                    break;
                }
                temp /= 10; 
            }

            if (isSelfDividing) {
                result.add(num); 
            }
        }

        return result;
    }

    
	
	public static void main(String[] args) {
		int left = 1;
		int right = 22;
		
		System.out.println(selfDividingNumbers(left, right));
	}
}
