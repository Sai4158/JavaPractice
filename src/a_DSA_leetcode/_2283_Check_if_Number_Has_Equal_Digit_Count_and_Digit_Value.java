package a_DSA_leetcode;

import java.util.HashMap;

public class _2283_Check_if_Number_Has_Equal_Digit_Count_and_Digit_Value {
	
    public static boolean digitCount(String num) {
        
//    	Using hashmap
    	HashMap<Integer, Integer> hm =  new HashMap<Integer, Integer>();

//Forloop to add the numbers and the count
    	for (int i = 0; i < num.length(); i++) {
			
    		int digit = num.charAt(i)- '0';
    		
    		hm.put(digit, hm.getOrDefault(digit, 0)+1);
		}
    	
//    	Forloop to check the if its not the same then return false 
    	for (int i = 0; i < num.length(); i++) {
			
    		int excepted  = num.charAt(i) - '0';
			int stored  = hm.getOrDefault(i, 0);
		
			if(excepted != stored) {
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
