package a_DSA_leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class _Last_Stone_Weight {

	
    public static int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    	
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        
        
        while(maxHeap.size() > 1) {
        	
        	int y = maxHeap.poll();
        	int x = maxHeap.poll();
        	
        	
        	if(y != x) {
        		maxHeap.add(y - x);
        	}
        	
        }
        
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
        
    }
    
    
    public static void main(String[] args) {
		
    	
    	
	}
	
}
