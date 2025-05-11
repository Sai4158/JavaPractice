package a_DSA_leetcode;

public class _2283_Check_if_Number_Has_Equal_Digit_Count_and_Digit_Value {
	
    public static boolean digitCount(String num) {
        
    	int ans[] =  new int [10];
    	
    	for (int i = 0; i < num.length(); i++) {
			
    		int digit = num.charAt(i) - '0';
    		
    		 ans[digit]++; 
		}
    	
    	for (int i = 0; i < num.length(); i++) {
			int excepted  = num.charAt(i) - '0';
			
			if(ans[i] != excepted) {
				return false;
			}
			
		}
    	return true;
    }
	
	public static void main(String[] args) {
		String num = "1210";
		System.out.println(digitCount(num));
	}
}
