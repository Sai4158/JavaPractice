package a_DSA_leetcode;

public class _2243_Calculate_Digit_Sum_of_a_String {
	
    public static String digitSum(String s, int k) {
        
        while (s.length() > k) {
    		
    		String news = "";
    		
            for (int i = 0; i < s.length(); i += k) {
				
    			int sum = 0;
    			
    			for (int j = i; j < i + k && j < s.length(); j++) {
                    sum += s.charAt(j) - '0';  
                }
    			
    			news += String.valueOf(sum);
    			
			}
    		s =  news;
    	}
    	
    	return s;
    	
    }
	
	public static void main(String[] args) {
		 System.out.println(digitSum("11111222223", 3));
	}
}
