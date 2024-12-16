package a_DSA_leetcode;

public class _1486_XOR_Operation_in_an_Array_ {

	  public static int xorOperation(int n, int start) {
	        
	        int ans =  start;

	        for(int  i = 1; i < n; i++){

	            ans =  ans ^ (start + 2 * i);
	        }

	        return ans;
	    }
	 
	 public static void main(String[] args) {
		
		 int n =  5;
		 int start = 4;
		 
		 System.out.println(xorOperation(n, start));
	}
}
