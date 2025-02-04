package a_DSA_leetcode;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _1796_Second_Largest_Digit_in_a_String {
	
    public static int secondHighest(String s) {

    	
    	
    	ArrayList<Integer> al = new ArrayList<>();
    	
    	for (int i = 0; i < s.length(); i++) {
			
    		int c = s.charAt(i);
    		
    		
    		if(Character.isDigit(c)) {
    			
    			int num =  c - '0';
    			
    			if(!al.contains(num))
    			
    			al.add(num);
    		}
    		
		}
    	
    	Collections.sort(al);
    	
    	int ans = 0;
    	
    	if(al.size() > 1) {
    		ans = al.get(al.size()-2);
    	}else {
    		ans =  -1;
    	}
    	
    	return ans;
	
    }
	
	public static void main(String[] args) {
		
		String s = "dfa12321afd";
		
		System.out.println(secondHighest(s));
	}
	
}
