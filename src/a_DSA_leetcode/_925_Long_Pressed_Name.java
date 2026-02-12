package a_DSA_leetcode;

import java.util.HashMap;

public class _925_Long_Pressed_Name {
	
    public static boolean isLongPressedName(String name, String typed) {
       
		int l = 0;
		int r = 0;
		
		while(r<typed.length()) {
			
			if(l < name.length() && name.charAt(l) == typed.charAt(r)) {
				l++;
				r++;
			}
			
        else if (r > 0 && typed.charAt(r) == typed.charAt(r - 1)) {
        	r++;
        }
			
			else {
				return false;
			}
			
		}
		
		return l == name.length();
    }
    
    
    public static void main(String[] args) {
		String name = "alex", typed = "aaleex";
		System.out.println(isLongPressedName(name, typed));
	}
	
}
