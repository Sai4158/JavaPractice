package a_DSA_leetcode;

import java.sql.Time;
import java.util.Iterator;

public class _2432_The_Employee_That_Worked_on_the_Longest_Task {

	
    public static int hardestWorker(int n, int[][] logs) {
        
        int prevEnd = 0;
        int bestId = Integer.MAX_VALUE;
        int bestTime = 0;
    	
    	for (int i = 0; i < logs.length; i++) {
			
    		int id = logs[i][0];
            int end = logs[i][1];
    		
    		int time = end - prevEnd;
    		
    		if(time > bestTime || (time ==  bestTime && id < bestId)) {
    			
    			
    			bestTime = time;
    			bestId = id;
    		}
    		
    		
    		prevEnd = end;
		}
    	
    	return bestId;
    	
    }
	
	public static void main(String[] args) {
		
	}
	
}
