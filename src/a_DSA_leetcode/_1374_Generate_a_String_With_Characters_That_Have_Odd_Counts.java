package a_DSA_leetcode;

public class _1374_Generate_a_String_With_Characters_That_Have_Odd_Counts {
	
    public static String generateTheString(int n) {
        
    	String ans = "";
    	
    	for (int i = 0; i < n; i++) {
			
    		if(n % 2 == 0 && i == n -1) {
    			ans += "b";
    		}else {
    			ans += "a";
    		}
		}
    	return ans;
    }
	
	public static void main(String[] args) {
		System.out.println(generateTheString(4)); 
	}
}
