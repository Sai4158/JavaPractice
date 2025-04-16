package a_DSA_leetcode;

import java.util.HashMap;

public class _2264_Largest_3_Same_Digit_Number_in_String {
	
    public static String largestGoodInteger(String num) {
        
        HashMap<String, Boolean> hm = new HashMap<>();
    	String ans =  "";
    	
    	  for (int i = 0; i < num.length() - 2; i++) {
              char a = num.charAt(i);
              char b = num.charAt(i + 1);
              char c = num.charAt(i + 2);

              if (a == b && b == c) {
                  String sub = "" + a + b + c;
                  hm.put(sub, true); 

                  if (ans.equals("") || sub.compareTo(ans) > 0) {
                      ans = sub; 
                  }
              }
          }
    	  
    	  return ans;
    	
    }
	
	public static void main(String[] args) {
		 String num = "6777133339";
	     System.out.println(largestGoodInteger(num)); 
	}
}
