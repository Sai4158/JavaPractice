package a_DSA_leetcode;

import java.time.LocalDate;

public class _1154_Day_of_the_Year {
	
    public static int dayOfYear(String date) {
        
    	int n = date.length();

    	LocalDate d =  LocalDate.parse(date);
    	
    	return d.getDayOfYear();
    	
    }
    
    
    public static void main(String[] args) {
		
    	String date = "2019-01-09";
    	System.out.println(dayOfYear(date));
	}
	
}
