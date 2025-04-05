package a_DSA_leetcode;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Deque;

public class _950_Reveal_Cards_In_Increasing_Order {

	public static int[] deckRevealedIncreasing(int[] deck) {

		int n =  deck.length;
		int ans[] =  new int[n];
		Deque<Integer> q = new LinkedList<Integer>();		
		
		Arrays.sort(deck);
		
        for (int i = 0; i < n; i++) {
			q.add(i);
		}


        for (int i = 0; i < n; i++) {

			int first = q.pollFirst();
			ans[first] =  deck[i];

			
			if(!q.isEmpty()) {
				
				q.addLast(q.pollFirst());
			}
			
		}


		return ans;
	}

	public static void main(String[] args) {
		int deck[] = {17,13,11,2,3,5,7};
        int[] result = deckRevealedIncreasing(deck);
		System.out.println(Arrays.toString(result));
	}
}
