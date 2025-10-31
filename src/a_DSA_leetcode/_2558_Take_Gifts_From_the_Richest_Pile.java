package a_DSA_leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class _2558_Take_Gifts_From_the_Richest_Pile {
	
    public static long pickGifts(int[] gifts, int k) {
        
    	int  n = gifts.length;
    	
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			
			q.add(gifts[i]);
			
		}
		
		
		for (int i = 0; i < k; i++) {
			
			
			int max = q.poll();
			int val = (int) Math.sqrt(max);
			q.add(val);
			
		}
		
		long ans = 0;
		
		for (int i : q) {
			
			ans += i;
		}
    	
		return ans;
    }
	
	public static void main(String[] args) {
		
	}
}
