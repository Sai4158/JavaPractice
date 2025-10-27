package a_DSA_leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class _1_2974MinimumNumberGame {

	public static int[] numberGame(int[] nums) {

		int n =  nums.length;

		Queue<Integer> q = new PriorityQueue<Integer>();

		int[] ans =  new int[n];


		for (int i = 0; i < n; i++) {

			q.add(nums[i]);

		}


		int j = 0;

		while(q.size()>0) {
			int alice = q.poll();
			int bob = q.poll();
			
			ans[j] = bob;
			j++;
			
			ans[j] =  alice;
			j++;

		}
		
		
		return ans;


	}

	public static void main(String[] args) {

		int nums[] = {5,4,2,3};
		System.out.println(numberGame(nums));

	}

}
