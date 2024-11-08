package a_DSA_part_21_to_part_30;

public class Day17_java23_switch {
	
			
		  public static String test(String s) {
		        return switch (s) {
		            case "123" -> "number";
		            default -> throw new IllegalArgumentException("Invalid day: " + s);
		        };
		    }
	
	public static void main(String[] args) {
		   String  s = "123";
	        System.out.println(test(s));

	}
}
