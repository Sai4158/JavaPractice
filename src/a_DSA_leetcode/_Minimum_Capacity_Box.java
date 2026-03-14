package a_DSA_leetcode;

public class _Minimum_Capacity_Box {

	
    public static int minimumIndex(int[] capacity, int itemSize) {

    	int ans = -1;
        int bestCapacity = Integer.MAX_VALUE;
        
        
        for (int i = 0; i < capacity.length; i++) {
			
        	if(capacity[i] >= itemSize) {
        		
        		if(capacity[i] <= bestCapacity) {
        			bestCapacity = capacity[i];
        			ans =  i;
        		}
        		
        	}
        	
		}
        
        return ans;
        
    }
	
	public static void main(String[] args) {
		
		int capacity[] = {1,5,3,7}; 
		int itemSize = 3;
		
		System.out.println(minimumIndex(capacity, itemSize));
		
	}
	
}
