package Q2;

public class _Time_Needed_to_Buy_Tickets {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        
    	int n =  tickets.length;
    	
    	int time = 0;
    	int target = tickets[k];
    	
    	for (int i = 0; i < tickets.length; i++) {
			
    		if(i <= k) {
    			time += Math.min(tickets[i], target);
    		}
    		
    		 else {
                 time += Math.min(tickets[i], target - 1);
             }
    		
		}
    	
    	return time;
    	
    }
    
    public static void main(String[] args) {
		
    	int tickets[] = {2,3,2};
    	int k = 2;
    	
    	System.out.println(timeRequiredToBuy(tickets, k));
	}
	
}
