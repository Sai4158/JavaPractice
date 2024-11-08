package a_DSA_part_21_to_part_30;

public class Day17_23_SwitchCase {

	    public static String getDayType(String day) {
	        return switch (day) {
	            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
	            case "SATURDAY", "SUNDAY" -> "Weekend";
	            default -> throw new IllegalArgumentException("Invalid day: " + day);
	        };
	    }
	    
	    
	    public static void main(String[] args) {
	        String dayType = getDayType("MONDAY");
	        System.out.println(dayType);
	    }
	}


