package a_DSA_leetcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class _1360_Number_of_Days_Between_Two_Dates {

	
    public static int  daysBetweenDates(String date1, String date2) {
        
    	LocalDate ld1 =  LocalDate.parse(date1);
    	LocalDate ld2 =  LocalDate.parse(date2);
    	
    	return (int) Math.abs(ChronoUnit.DAYS.between(ld1, ld2));
    	
    }
    
    public static void main(String[] args) {
		String date1 = "2019-06-29", date2 = "2019-06-30";
		System.out.println(daysBetweenDates(date1, date2));
	}
}
