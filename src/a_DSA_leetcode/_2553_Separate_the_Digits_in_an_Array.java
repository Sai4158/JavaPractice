package a_DSA_leetcode;

import java.util.ArrayList;

public class _2553_Separate_the_Digits_in_an_Array {
    
    public static int[] separateDigits(int[] nums) {
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(nums[i]));
            
            for (int j = 0; j < sb.length(); j++) {
                al.add(sb.charAt(j) - '0');
            }
        }
        
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }

        return ans;
    }

    
    public static void main(String[] args) {
		int nums[] = {13,25,83,77};
		System.out.println(separateDigits(nums));
	}
}	
