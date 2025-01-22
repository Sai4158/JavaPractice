package a_DSA_leetcode;

public class _69_Sqrtx {
	
	public static int mySqrt(int x) {
        
		if (x == 0) {
            return 0;
        }
		
        int l = 1;
        int r = x;
        int result = 0; 
        
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (mid == x / mid) {
                return mid; 
                
            } else if (mid > x / mid) {
                r = mid - 1; 
                
            } else {
                result = mid; 
                l = mid + 1; 
            }
        }
        return result;
    }
	   
	
	public static void main(String[] args) {
		 int x = 8;
	        System.out.println(mySqrt(x));
	}
}
