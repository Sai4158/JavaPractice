package a_DSA_leetcode;

public class _2443_Sum_of_Number_and_Its_Reverse {

	
    public static boolean sumOfNumberAndReverse(int num) {
        
    	 for (int i = 0; i <= num; i++) {
             StringBuilder sb = new StringBuilder(String.valueOf(i));
        	
        	int rev =  Integer.parseInt(sb.reverse().toString());
        	
        	if(i + rev == num) {
        		return true;
        	}
		}
    	
    	return false;
    }
	
	public static void main(String[] args) {
		int num = 443;
		System.out.println(sumOfNumberAndReverse(num));
	}
}
