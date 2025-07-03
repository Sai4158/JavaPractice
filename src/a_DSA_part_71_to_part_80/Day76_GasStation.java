package a_DSA_part_71_to_part_80;

public class Day76_GasStation {

	
    public static int canCompleteCircuit(int[] gas, int[] cost) {
    	
    	int tank = 0;
    	int start = 0;
    	int total = 0;
    	
    	
    	for (int i = 0; i < cost.length; i++) {
		
    		int gain =  gas[i] -  cost[i];
    		
    		total += gain;
    		tank += gain;
    		
    		if(tank < 0) {
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
