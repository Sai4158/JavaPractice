package a_DSA_leetcode;

public class _2864_Maximum_Odd_Binary_Number {

    public static String maximumOddBinaryNumber(String s) {
        
    	int zero = 0; 
    	int one = 0; 
    	
    	
    	for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				one++;
			}else {
				zero++;
			}
		}
    	
    	
    	String ans = "";
    	
    	for (int i = 0; i < one-1; i++) {
			ans += '1';
		}
    	
    	for (int i = 0; i < zero; i++) {
			ans += '0';
		}
    	
    	ans += '1';
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		
		String s = "010";
		System.out.println(maximumOddBinaryNumber(s));
		
	}
}
