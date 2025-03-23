package a_DSA_part_51_to_part_60;

public class Day57_StringBuilderRecap {
	
	public static void main(String[] args) {
		
		String a = "MONKEY";
		
		StringBuilder ab =  new StringBuilder(a);
		
		ab.replace(0, 0, a);
		ab.reverse();
		ab.append("Done");
		System.out.println(ab);
	}
}
