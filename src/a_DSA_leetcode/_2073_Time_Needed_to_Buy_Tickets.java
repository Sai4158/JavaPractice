package a_DSA_leetcode;

public class _2073_Time_Needed_to_Buy_Tickets {
	
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
    	int n = tickets.length;
    	
    	int count = 0;
    	
    	for (int i = 0; i < n; i++) {
			
    		if(i <= k) {
    			
    			count += Math.min(tickets[i], tickets[k]);
    		}else {
    			count += Math.min(tickets[i], tickets[k]-1);
    		}
    		
		}
    	return count;
    }
	
	public static void main(String[] args) {
		 System.out.println(timeRequiredToBuy(new int[]{2, 3, 2}, 2));
		 System.out.println(timeRequiredToBuy(new int[]{5, 6, 9}, 7));
	}
}
