package a_DSA_leetcode;

public class _1844_Replace_All_Digits_with_Characters {
	
    public static String replaceDigits(String s) {
        
    	String ans = "";
    	
    	for (int i = 0; i < s.length(); i++) {
			
    		if(i%2==0) {
    			
    			ans += s.charAt(i);
    			
    		}
    		
    		else {
    			
    			char prev =  s.charAt(i-1);
    			int digit = s.charAt(i) - '0';
    			
    			char shifted =  (char)(prev + digit);
    			
    			ans += shifted;
    		}
    		
		}
    	
    	return ans;
    	
    }
	
	public static void main(String[] args) {
		System.out.println(replaceDigits("a1c1e1"));
	}
}
