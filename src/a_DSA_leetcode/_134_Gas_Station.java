package a_DSA_leetcode;import java.util.concurrent.CancellationException;

public class _134_Gas_Station {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
    
    	int total = 0;
    	int tank = 0;
    	int start = 0;
    	
    	
    	for (int i = 0; i < cost.length; i++) {
			
    		int gain = gas[i] - cost[i];
    		
    		
    		total += gain;
    		tank += gain;
    		
    		if(tank  < 0) {
    			tank = 0;
    			start = i + 1;
    		}
    
		}
    	
    	if(total < 0) {
    		return -1;
    	}
    	
    	return start;
    	
    }
    
    public static void main(String[] args) {
		
    	int gas[] = {1,2,3,4,5}, cost[] = {3,4,5,1,2};
    	System.out.println(canCompleteCircuit(gas, cost));
	}
	
}
