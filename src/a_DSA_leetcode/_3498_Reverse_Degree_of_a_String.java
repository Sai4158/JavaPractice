package a_DSA_leetcode;

public class _3498_Reverse_Degree_of_a_String {

    public static int reverseDegree(String s) {
        
    	StringBuilder sb = new StringBuilder(s);
    	sb.reverse();
    	int sum = 0;
    	
    	for (int i = 0; i < sb.length(); i++) {
			
    		int val = sb.charAt(i);
    		
    		int reverse = 'z'-val+1;
    		int position = s.length() - i;
    	
    		sum += reverse * position;
		}
    	return sum;
    }
	
	public static void main(String[] args) {
		
		String s = "abc";
		System.out.println(reverseDegree(s));
	}
}
