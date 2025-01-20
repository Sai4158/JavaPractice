package a_DSA_leetcode;

public class _278_First_Bad_Version {
	
    public static int firstBadVersion(int n) {
        
    	int  l = 0;
    	
    	int r =  n;
    	
    	
    	while(l<=r) {
    		
    		int mid = l + (r-l)/2;    	
    		
    		if(isBadVersion(mid)) {
    			r = mid -1;
    		}else {
    			l = mid + 1;
    		}
    		
    	}
    	return l;
    	
    }
    
    public static void main(String[] args) {
	
    	
    	int n = 5;
    	System.out.println(firstBadVersion(n));
	}
    
}
