package a_DSA_part_51_to_part_60;

public class Day56_IntroToStringBuilder {
	
	public static void main(String[] args) {
		
		String name = "Sai";
		name += "s";
		System.out.println(name);
		
		
		StringBuilder nameb = new StringBuilder("hello");
		
//		This will add to string
		nameb.append("!");
		
		
		System.out.println(nameb);
		
	}
}	
