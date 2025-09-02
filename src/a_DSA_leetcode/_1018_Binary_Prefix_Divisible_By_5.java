package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1018_Binary_Prefix_Divisible_By_5 {

	public static List<Boolean> prefixesDivBy5(int[] nums) {

		int n =  nums.length;
		List<Boolean> answer = new ArrayList<>(); 
		int num = 0;
		
		for (int i = 0; i < n; i++) {

			num =  (num*2 + nums[i]) % 5;	
			
//			if num = 0 then add it
			answer.add(num == 0);
		}

		
		return answer;
	}

	public static void main(String[] args) {
		int nums[] = {0,1,1};
		System.out.println(prefixesDivBy5(nums));
	}
}
