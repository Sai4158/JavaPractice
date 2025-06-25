package a_DSA_part_71_to_part_80;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day72_NumberofDaysBetweenTwoDates {
	
    public static int  daysBetweenDates(String date1, String date2) {

    	LocalTime l1 =  LocalTime.parse(date1);
    	LocalTime l2 =  LocalTime.parse(date2);
    	
    	return (int) Math.abs(ChronoUnit.DAYS.between(l1, l2));
    }
	
	public static void main(String[] args) {
		String date1 = "2019-06-29", date2 = "2019-06-30";
		System.out.println(daysBetweenDates(date1, date2));
	}
}
